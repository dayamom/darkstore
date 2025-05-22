package com.taller.servicio;

import com.taller.entidades.Categoria;

import java.util.List;

public interface CategoriasServicio {

    List<Categoria> getTodasCategoriasManual();

    Categoria crearCategoria(Categoria categoria);
    Categoria actualizarCategoria(long id , Categoria categoria);
    void eliminarCategoria(long id);
}
