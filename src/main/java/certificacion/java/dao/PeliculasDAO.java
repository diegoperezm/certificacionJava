package certificacion.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import certificacion.java.model.Peliculas;

public interface PeliculasDAO extends JpaRepository<Peliculas, Integer>{
  List<Peliculas> findAll();
}
