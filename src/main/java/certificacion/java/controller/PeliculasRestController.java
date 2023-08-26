package certificacion.java.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
  	
	
 @GetMapping("/peliculas")	
 public ResponseEntity<Map<String,Object>> listaPeliculas() {
   Map<String, Object> l = new HashMap<>();
   List<Peliculas> peliculas = peliculasDAO.findAll();

   for(Peliculas p : peliculas) {
	    l.put(p.getTitulo().toString(),
	    	  p.getAnio_lanzamiento()
	    	 );
	    }

   return new ResponseEntity<>(l, HttpStatus.OK);
 }	

}
