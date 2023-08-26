package certificacion.java.model;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
public class Peliculas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id_pelicula;
    
	private String titulo;
    private int anio_lanzamiento;
    private int id_genero;

}
