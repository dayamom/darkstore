package modelos.entidades.repositorio;

import modelos.entidades.Usuario;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    List<Usuario> findAll();

    @Query(value = "SELECT * FROM usuarios WHERE id = 10", nativeQuery = true)
    List<Usuario> traerTodo();
}
