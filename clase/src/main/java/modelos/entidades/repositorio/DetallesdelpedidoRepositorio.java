package modelos.entidades.repositorio;

import modelos.entidades.Detallesdelpedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetallesdelpedidoRepositorio extends JpaRepository<Detallesdelpedido, Long> {


    @Query(value = "SELECT * FROM Detallesdelpedido", nativeQuery = true)
    List<Detallesdelpedido> findAllDetallesdelpedido();
}
