package certificacion.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import certificacion.java.model.Calificaciones;

public interface CalificacionesDAO extends JpaRepository<Calificaciones, Long>{ 
	List<Calificaciones> findAll();
}
