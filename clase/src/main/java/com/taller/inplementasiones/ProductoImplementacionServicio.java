package com.taller.inplementasiones;

import com.taller.entidades.Producto;

import com.taller.entidades.repositorio.ProdutosRepositorio;
import org.springframework.stereotype.Service;

import com.taller.servicio.ProductoServicio;

import java.util.List;

@Service
public class ProductoImplementacionServicio implements ProductoServicio {

    private final ProdutosRepositorio productosRepositorio;

    public ProductoImplementacionServicio(ProdutosRepositorio productosRepositorio) {
        this.productosRepositorio = productosRepositorio;
    }

    @Override
    public List<Producto> getAllProductos() {
        return productosRepositorio.findAll();
    }
}
