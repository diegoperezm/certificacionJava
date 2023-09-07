package certificacion.java.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import certificacion.java.model.Peliculas;
import certificacion.java.services.PeliculasService;
import certificacion.java.services.dto.PeliculasDTO;

@Controller
@RequestMapping("/")
public class PeliculasController {

    private final Logger logger = LoggerFactory.getLogger(PeliculasController.class);
	private final PeliculasService peliculasService;

	public PeliculasController(PeliculasService peliculasService) {
		this.peliculasService = peliculasService;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<PeliculasDTO> listaPeliculas =  peliculasService.listarPeliculas();
		model.addAttribute("listaPeliculas",listaPeliculas);
		return "listadopeliculas";
	}

	@GetMapping("/calificarPelicula/{id}")
	public String calificarPelicula(@PathVariable Long id,Model model) {
		PeliculasDTO pelicula = peliculasService.findPeliculaById(id);
        model.addAttribute("pelicula", pelicula);
	    return "calificar";	
	}
 
	@PostMapping("/agregarCalificacion/{id}")
	public String calificarPelicula(@PathVariable Long id,
			                        @RequestParam("calificacion") int calificacion , Model model) {
	PeliculasDTO pelicula = peliculasService.findPeliculaById(id);
	 logger.info("calificación {}  ID: {}", calificacion, pelicula.getId_pelicula());
	return "redirect:/listadoPeliculas";
	}
	
    @PostMapping("/buscarPorTitulo")	
    public String buscarPorTitulo(@RequestParam("titulo") String titulo, Model model) {
     List<PeliculasDTO>  listaPeliculas = peliculasService.findPeliculaPorTitulo(titulo);
     model.addAttribute("listaPeliculas", listaPeliculas);
      return "listadopeliculas";	
    }
	
}
