package certificacion.java.services.dto;


public class PeliculasDTO {

	private int id_pelicula;
	private int puntuacion;
	private int anio_lanzamiento;
	private String titulo;
	private String nombre_genero;

	public PeliculasDTO() {
	}

	public PeliculasDTO(int id_pelicula, int puntuacion, int anio_lanzamiento, String titulo, String nombre_genero) {
		super();
		this.id_pelicula = id_pelicula;
		this.puntuacion = puntuacion;
		this.anio_lanzamiento = anio_lanzamiento;
		this.titulo = titulo;
		this.nombre_genero = nombre_genero;
	}

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getAnio_lanzamiento() {
		return anio_lanzamiento;
	}

	public void setAnio_lanzamiento(int anio_lanzamiento) {
		this.anio_lanzamiento = anio_lanzamiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre_genero() {
		return nombre_genero;
	}

	public void setNombre_genero(String nombre_genero) {
		this.nombre_genero = nombre_genero;
	}

}
