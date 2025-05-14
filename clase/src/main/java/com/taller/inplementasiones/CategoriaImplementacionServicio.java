package com.taller.inplementasiones;

import com.taller.entidades.Categoria;
import com.taller.entidades.repositorio.CategoriaRepositorio;
import com.taller.servicio.CategoriasServicio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaImplementacionServicio implements CategoriasServicio {

    private final CategoriaRepositorio categoriaRepositorio;

    public CategoriaImplementacionServicio(CategoriaRepositorio categoriaRepositorio) {
        this.categoriaRepositorio = categoriaRepositorio;
    }

    @Override
    public List<Categoria> getTodasCategoriasManual() {
        return categoriaRepositorio.findAllCategoriasManual();
    }
}


