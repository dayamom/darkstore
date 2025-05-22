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

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(long id, Categoria categoria) {
        Categoria existente = categoriaRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        existente.setCategoria(categoria.getCategoria());
        return categoriaRepositorio.save(existente);
    }

    @Override
    public void eliminarCategoria(long id) {
        categoriaRepositorio.deleteById(id);
    }
}