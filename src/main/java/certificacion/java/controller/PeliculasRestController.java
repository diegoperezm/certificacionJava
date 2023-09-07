package certificacion.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import certificacion.java.services.PeliculasService;
import certificacion.java.services.dto.PeliculasDTO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class PeliculasRestController {
	@Autowired
	PeliculasService peliculasService;

	@GetMapping("/p")
	public ResponseEntity<List<PeliculasDTO>> listaPeliculas() {
		List<PeliculasDTO> listaPeliculas =  peliculasService.listarPeliculas();
		return ResponseEntity.ok(listaPeliculas);
	}

}
