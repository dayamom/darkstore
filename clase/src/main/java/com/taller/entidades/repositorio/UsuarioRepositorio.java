package com.taller.entidades.repositorio;

import com.taller.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM usuarios", nativeQuery = true)
    List<Usuario> traerTodo();

}
