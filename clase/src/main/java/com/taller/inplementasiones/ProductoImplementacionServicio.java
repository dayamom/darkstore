package com.taller.inplementasiones;

import modelos.entidades.producto;

import modelos.entidades.repositorio.ProdutosRepositorio;
import org.springframework.stereotype.Service;

import servicio.productoServicio;

import java.util.List;

@Service
public class ProductoImplementacionServicio implements productoServicio {

    private final ProdutosRepositorio productosRepositorio;

    public ProductoImplementacionServicio(ProdutosRepositorio productosRepositorio) {
        this.productosRepositorio = productosRepositorio;
    }

    @Override
    public List<producto> getAllProductos() {
        return productosRepositorio.findAll();
    }
}
