package certificacion.java.model;

import jakarta.persistence.*;


@Entity
@Table(name = "calificaciones")
public class Calificaciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_calificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pelicula")
    private Peliculas pelicula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
	private Usuarios usuario;

	private int puntuacion;
	private String resena;

	public Calificaciones() {
	}

	public int getId_calificacion() {
		return id_calificacion;
	}

	public void setId_calificacion(int id_calificacion) {
		this.id_calificacion = id_calificacion;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getResena() {
		return resena;
	}

	public void setResena(String resena) {
		this.resena = resena;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

}
