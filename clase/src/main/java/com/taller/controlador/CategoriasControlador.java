package com.taller.controlador;

import com.taller.entidades.Categoria;
import com.taller.servicio.CategoriasServicio;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/categoria")
    public Categoria crearCategoria(@RequestBody Categoria categoria){
        return categoriasServicio.crearCategoria(categoria);
    }
    @PutMapping("/categoria/{id}")
    public Categoria actualizarCategoria(@PathVariable long id , @RequestBody Categoria categoria){
        return categoriasServicio.actualizarCategoria(id, categoria);
    }
    @DeleteMapping("/categoria/{id}")
    public void eliminarCategoria(@PathVariable Long id) {
        categoriasServicio.eliminarCategoria(id);
    }
}
