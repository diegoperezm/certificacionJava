package certificacion.java.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certificacion.java.dao.CalificacionesDAO;
import certificacion.java.dao.PeliculasDAO;
import certificacion.java.model.Calificaciones;
import certificacion.java.model.Peliculas;
import certificacion.java.services.dto.PeliculasDTO;

@Service
public class PeliculasService {

	@Autowired
	PeliculasDAO peliculasDAO;

	@Autowired
	CalificacionesDAO calificacionesDAO;

	public PeliculasService(PeliculasDAO peliculasDAO, CalificacionesDAO calificacionesDAO) {
		super();
		this.peliculasDAO = peliculasDAO;
		this.calificacionesDAO = calificacionesDAO;
	}

	public List<PeliculasDTO> listarPeliculas() {
		List<PeliculasDTO> peliculasDTO = new ArrayList<PeliculasDTO>();
		List<Peliculas> peliculas = peliculasDAO.findAll();
		
	   for(Peliculas pelicula : peliculas) {
  		   List<Integer> puntuaciones = getPuntaciones(pelicula);
		   peliculasDTO.add(new PeliculasDTO(
                              pelicula.getId_pelicula(),
                              puntuaciones,
                              pelicula.getAnio_lanzamiento(),
                              pelicula.getTitulo(),
                              pelicula.getGenero().getNombre_genero()
		      		   ));
	   }
		return peliculasDTO;
	}
	
	private List<Integer> getPuntaciones(Peliculas pelicula) {
	   List<Integer> puntuaciones = pelicula
			                     .getCalificaciones()
			                     .stream()
			                     .map(Calificaciones::getPuntuacion)
			                     .collect(Collectors.toList());
	   return puntuaciones;
	}



}
