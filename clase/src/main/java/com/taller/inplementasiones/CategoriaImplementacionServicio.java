package com.taller.inplementasiones;

import modelos.entidades.Categoria;
import modelos.entidades.pedido;
import modelos.entidades.repositorio.CategoriaRepositorio;
import modelos.entidades.repositorio.PedidoRepositorio;
import servicio.PedidoServicio;
import servicio.categoriaServicio;

import java.util.List;

public class CategoriaImplementacionServicio implements categoriaServicio {

    private final CategoriaRepositorio CategoriaRepositorio;


    public CategoriaImplementacionServicio(CategoriaRepositorio CategoriaRepositorio) {
        this.CategoriaRepositorio = CategoriaRepositorio;
    }

    @Override
    public List<Categoria> getAllCategoria() {
        return CategoriaRepositorio.findAllCategoria();
    }
}