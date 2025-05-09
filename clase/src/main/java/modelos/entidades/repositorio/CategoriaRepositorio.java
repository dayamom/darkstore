package modelos.entidades.repositorio;

import modelos.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {


    @Query(value = "SELECT * FROM Categoria", nativeQuery = true)
    List<Categoria> findAllCategoria();
}