package certificacion.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import certificacion.java.model.Peliculas;
import jakarta.transaction.Transactional;

public interface PeliculasDAO extends JpaRepository<Peliculas, Integer>{
     List<Peliculas> findAll();

}
