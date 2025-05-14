package com.taller.entidades.repositorio;

import com.taller.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepositorio extends JpaRepository<Producto, Long> {


    @Query(value = "SELECT * FROM Produtos", nativeQuery = true)
    List<Producto> findAllProdutos();

}