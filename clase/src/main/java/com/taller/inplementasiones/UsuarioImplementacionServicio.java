package com.taller.inplementasiones;

import com.taller.entidades.Usuario;
import com.taller.entidades.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;
import com.taller.servicio.UsuarioServicio;

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

