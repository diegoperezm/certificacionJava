package certificacion.java.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import certificacion.java.model.Peliculas;
import certificacion.java.services.PeliculasService;
import certificacion.java.services.dto.PeliculasDTO;

@Controller
@RequestMapping("/")
public class PeliculasController {

	private final PeliculasService peliculasService;

	public PeliculasController(PeliculasService peliculasService) {
		this.peliculasService = peliculasService;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<PeliculasDTO> pp =  peliculasService.listarPeliculas();
		model.addAttribute("listaPeliculas", pp);
		return "listadopeliculas";
	}

	@PostMapping("/addCalificacion?")
	public String addCalificacon() {
		return "listadopeliculas";
	}

	@GetMapping("/calificarPelicula/{id}")
	public String calificarPelicula(@PathVariable int id, Model model) {
		Peliculas pelicula = peliculasService.buscarPorId(id);
        model.addAttribute("pelicula", pelicula);
		return "calificar";
	}

}
