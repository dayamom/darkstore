package modelos.entidades.repositorio;

import modelos.entidades.Pedido;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {


    @Query(value = "SELECT * FROM pedidos", nativeQuery = true)
    List<Pedido> findAllPedidos();

}
