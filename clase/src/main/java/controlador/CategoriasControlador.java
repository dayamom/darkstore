package controlador;

import modelos.entidades.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.categoriaServicio;

import java.util.List;

@RestController
public class CategoriasControlador {
    private final categoriaServicio categoriasServicio;

    public CategoriasControlador(categoriaServicio categoriasServicio) {
        this.categoriasServicio = categoriasServicio;
    }

    @GetMapping("/categorias/manual")
    public List<Categoria> categoriasManual() {
        return categoriasServicio.getTodasCategoriaManual();
    }
}
