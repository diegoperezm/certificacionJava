package certificacion.java.services;

import java.util.ArrayList;
import java.util.List;

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

		List<PeliculasDTO> p = new ArrayList<PeliculasDTO>();
		List<Calificaciones> calificaciones = calificacionesDAO.findAll();
		List<Peliculas> peliculas = peliculasDAO.findAll();

		for (Peliculas pelicula : peliculas) {
			for (Calificaciones calificacion : calificaciones) {
				if (pelicula.getId_pelicula() == calificacion.getPelicula().getId_pelicula()) {
					p.add(new PeliculasDTO(
							pelicula.getId_pelicula(),
							calificacion.getPuntuacion(),
							pelicula.getAnio_lanzamiento(),
							pelicula.getTitulo(),
							pelicula.getGenero().getNombre_genero()
							)
						);
				}
			}
		}

		return p;
	}

	public Peliculas buscarPorId(int id) {
		return peliculasDAO.findById(id);
	}

}
