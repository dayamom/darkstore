package controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductosControlador {

    private final ProductosServicios productosServicio;

    public ProductosControlador(ProductosServicios productosServicio) {
        this.productosServicio = productosServicio;
    }

    @GetMapping("/productos/manual")
    public List<Producto> getProductosManual() {
        return productosServicio.getTodosProductosManual();
    }
}


