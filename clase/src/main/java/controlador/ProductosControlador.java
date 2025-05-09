package controlador;

import modelos.entidades.producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.productoServicio;

import java.util.List;

@RestController
public class ProductosControlador {

    private final productoServicio productoServicio;

    public ProductosControlador(productoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping("/productos/manual")
    public List<producto> getProductoManual() {
        return productoServicio.getAllProductos();
    }
}