package certificacion.java.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		List<PeliculasDTO> listaPeliculas =  peliculasService.listarPeliculas();
		model.addAttribute("listaPeliculas",listaPeliculas);
		return "listadopeliculas";
	}

}
