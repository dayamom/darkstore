package com.taller.controlador;

import com.taller.entidades.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.taller.servicio.ProductoServicio;

import java.util.List;

@RestController
public class ProductosControlador {

    private final ProductoServicio ProductoServicio;

    public ProductosControlador(ProductoServicio ProductoServicio) {
        this.ProductoServicio = ProductoServicio;
    }

    @GetMapping("/Productos/manual")
    public List<Producto> getProductoManual() {
        return ProductoServicio.getAllProductos();
    }
}