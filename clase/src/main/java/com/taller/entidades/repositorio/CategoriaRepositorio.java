package com.taller.entidades.repositorio;

import com.taller.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

    @Query(value = "SELECT * FROM categorias", nativeQuery = true)
    List<Categoria> findAllCategoriasManual();
}
