package modelos.entidades.repositorio;

import modelos.entidades.pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoRepositorio extends JpaRepository<pedido, Long> {


    @Query(value = "SELECT * FROM pedidos", nativeQuery = true)
    List<pedido> findAllPedidos();

}
