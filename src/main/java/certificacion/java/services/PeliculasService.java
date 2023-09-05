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

	public PeliculasService(PeliculasDAO peliculasDAO) {	
		this.peliculasDAO = peliculasDAO;
	}

	public List<PeliculasDTO> listarPeliculas() {
		List<PeliculasDTO> peliculasDTO = new ArrayList<PeliculasDTO>();
		List<Peliculas> peliculas = peliculasDAO.findAll();

		for (Peliculas pelicula : peliculas) {
			List<Integer> puntuaciones = getPuntaciones(pelicula);
			peliculasDTO.add(new PeliculasDTO(pelicula.getId_pelicula(), puntuaciones, pelicula.getAnio_lanzamiento(),
					pelicula.getTitulo(), pelicula.getGenero().getNombre_genero()));
		}
		return peliculasDTO;
	}

	public Peliculas findPeliculaById(Long id) {
		Optional<Peliculas> optPelicula = peliculasDAO.findById(id);
		return optPelicula.orElseThrow(() -> new RuntimeException("Pelicula no encontrada,ID: " + id));
	}

	private List<Integer> getPuntaciones(Peliculas pelicula) {
		List<Integer> puntuaciones = pelicula.getCalificaciones().stream().map(Calificaciones::getPuntuacion)
				.collect(Collectors.toList());
		return puntuaciones;
	}

}
