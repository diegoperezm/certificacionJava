package certificacion.java.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import certificacion.java.model.Peliculas;

public interface PeliculasDAO extends JpaRepository<Peliculas, Long>{
	Optional<Peliculas> findById(Long id);
}
