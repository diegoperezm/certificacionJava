package certificacion.java.model;

import jakarta.persistence.*;

@Entity
@Table(name = "calificaciones")
public class Calificaciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_calificacion;
	private int id_pelicula;
	private int id_usuario;
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

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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

	@Override
	public String toString() {
		return "Calificaciones [id_calificacion=" + id_calificacion + ", id_pelicula=" + id_pelicula + ", id_usuario="
				+ id_usuario + ", puntuacion=" + puntuacion + ", resena=" + resena + "]";
	}

}
