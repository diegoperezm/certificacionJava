package certificacion.java.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import certificacion.java.dao.PeliculasDAO;
import certificacion.java.model.Peliculas;

@Controller
@RequestMapping("/")
public class PeliculasController {

	private final PeliculasDAO peliculasDAO;

	public PeliculasController(PeliculasDAO peliculasDAO) {
		this.peliculasDAO = peliculasDAO;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Peliculas> listaPeliculas = peliculasDAO.findAll();
		model.addAttribute("listaPeliculas", listaPeliculas);
		return "listadopeliculas";
	}

	@PostMapping("/addCalificacion?")
	public String addCalificacon() {
		return "listadopeliculas";
	}

	@GetMapping("/calificarPelicula/{id}")
	public String calificarPelicula(@PathVariable int id, Model model) {
		Peliculas pelicula = peliculasDAO.findById(id);
        model.addAttribute("pelicula", pelicula);
		return "calificar";
	}

}
