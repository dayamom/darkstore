package comtrolador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductosControlador {
    private final ProductosServicio productosServicio;


    public ProductosControlador(ProductosServicio productosServicio){
        this.productosServicio = productosServicio;
    }

    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return productosServicio.getTodosProductos();
    }

    @GetMapping("/productos/manual")
    public List<Producto> getProductosManual(){
        return productosServicio.getTodosProductosManual();
    }
}

