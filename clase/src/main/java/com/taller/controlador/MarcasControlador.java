package com.taller.controlador;

import com.taller.entidades.Marcas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.taller.servicio.MarcasServicio;

import java.util.List;

@RestController
public class MarcasControlador {

    private final MarcasServicio marcasServicio;

    public MarcasControlador(MarcasServicio marcasServicio) {
        this.marcasServicio = marcasServicio;
    }

    @GetMapping("/Marcas/manual")
    public List<Marcas> getAllMarcas() {
        return marcasServicio.getAllMarcas();
    }
}

