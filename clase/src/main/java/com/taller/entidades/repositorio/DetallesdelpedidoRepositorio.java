package com.taller.entidades.repositorio;

import com.taller.entidades.Detallesdelpedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetallesdelpedidoRepositorio extends JpaRepository<Detallesdelpedido, Long> {

    @Query(value = "SELECT * FROM detallesdelpedido", nativeQuery = true)
    List<Detallesdelpedido> findAllDetallesdelpedido();
}
