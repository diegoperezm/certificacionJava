package certificacion.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import certificacion.java.dao.PeliculasDAO;
import certificacion.java.model.Peliculas;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class PeliculasRestController {
	@Autowired
	PeliculasDAO peliculasDAO;

	@GetMapping("/p")
	public ResponseEntity<List<Peliculas>> listaPeliculas() {
		return ResponseEntity.ok(peliculasDAO.findAll());
	}

}
