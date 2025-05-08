package com.taller.inplementasiones;

import modelos.entidades.Usuario;
import modelos.entidades.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import servicio.UsuarioServicio;

import java.util.List;

@Service
public class UsuarioImplementacionServicio implements UsuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioImplementacionServicio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public List<Usuario> getTodasUsuarioManual() {
        return usuarioRepositorio.traerTodo();
    }
}

