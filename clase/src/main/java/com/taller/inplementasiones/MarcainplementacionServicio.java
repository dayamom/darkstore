package com.taller.inplementasiones;

import com.taller.entidades.Marcas;
import com.taller.entidades.repositorio.MarcasRepositorio;
import com.taller.servicio.MarcasServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcainplementacionServicio implements MarcasServicio {

    private final MarcasRepositorio marcasRepositorio;

    public MarcainplementacionServicio(MarcasRepositorio marcasRepositorio) {
        this.marcasRepositorio = marcasRepositorio;
    }

    @Override
    public List<Marcas> getAllMarcas() {
        return marcasRepositorio.findAllMarcas();
    }
}

