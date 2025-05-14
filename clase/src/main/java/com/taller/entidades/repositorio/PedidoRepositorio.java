package com.taller.entidades.repositorio;

import com.taller.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

    @Query(value = "SELECT * FROM pedidos", nativeQuery = true)
    List<Pedido> findAllPedidos();
}

