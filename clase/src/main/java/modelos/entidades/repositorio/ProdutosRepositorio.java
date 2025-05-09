package modelos.entidades.repositorio;

import modelos.entidades.producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepositorio extends JpaRepository<producto, Long> {


    @Query(value = "SELECT * FROM Produtos", nativeQuery = true)
    List<producto> findAllProdutos();

}