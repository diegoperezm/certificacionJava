package certificacion.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import certificacion.java.dao.PeliculasDAO;
import certificacion.java.model.Peliculas;

@Controller
@RequestMapping("/")
public class PeliculasController {

	private final PeliculasDAO peliculasDAO;

	@Autowired
	public PeliculasController(PeliculasDAO peliculasDAO) {
		this.peliculasDAO = peliculasDAO;
	}

	
    @PostMapping("/addCalificacion?")	
    public String addCalificacon() {
      return  "listadopeliculas";
    }


	
    @GetMapping("/")	
    public String index(Model model) {
      List<Peliculas> listaPeliculas = peliculasDAO.findAll();
      model.addAttribute("listaPeliculas", listaPeliculas);
      return  "listadopeliculas";
    }


    @GetMapping("/calificarPelicula")	
    public String calificarPelicula() {
      return  "calificar";
    }

   
    @GetMapping("/listadoPeliculas")	
    public String listadoPeliculas(Model model) {
      List<Peliculas> listaPeliculas = peliculasDAO.findAll();
      model.addAttribute("listaPeliculas", listaPeliculas);
      return  "listadopeliculas";
    }

}
