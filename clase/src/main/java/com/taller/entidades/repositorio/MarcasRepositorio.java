package com.taller.entidades.repositorio;

import com.taller.entidades.Marcas;
import com.taller.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarcasRepositorio extends JpaRepository<Marcas, Long> {
    @Query(value = "SELECT * FROM marcas", nativeQuery = true)
    List<Marcas> findAllMarcas();
}