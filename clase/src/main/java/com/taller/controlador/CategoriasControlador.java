package com.taller.controlador;

import com.taller.entidades.Categoria;
import com.taller.servicio.CategoriasServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriasControlador {

    private final CategoriasServicio categoriasServicio;

    public CategoriasControlador(CategoriasServicio categoriasServicio) {
        this.categoriasServicio = categoriasServicio;
    }

    @GetMapping("/categorias/manual")
    public List<Categoria> CategoriaManual() {
        return categoriasServicio.getTodasCategoriasManual();
    }
}
