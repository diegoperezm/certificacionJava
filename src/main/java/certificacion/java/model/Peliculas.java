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

	public Peliculas() {
	}

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio_lanzamiento() {
		return anio_lanzamiento;
	}

	public void setAnio_lanzamiento(int anio_lanzamiento) {
		this.anio_lanzamiento = anio_lanzamiento;
	}

	public int getId_genero() {
		return id_genero;
	}

	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}

	@Override
	public String toString() {
		return "Peliculas [id_pelicula=" + id_pelicula + ", titulo=" + titulo + ", anio_lanzamiento=" + anio_lanzamiento
				+ ", id_genero=" + id_genero + "]";
	}

}
