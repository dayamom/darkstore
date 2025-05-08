package com.taller.inplementasiones;

import modelos.entidades.Detallesdelpedido;
import modelos.entidades.Usuario;
import modelos.entidades.repositorio.UsuarioRepositorio;

import java.util.List;

public class DetallesdelpedidoimplementacionServicioimplements implements DetallesdelpedidoServicio {

    private final DetallesdelpedidoRepositorio detallesdelpedidoRepositorio;

    public DetallesdelpedidoImplementacionServicio(DetallesdelpedidoRepositorio detallesdelpedidoRepositorio) {
        this.detallesdelpedidoRepositorio = detallesdelpedidoRepositorio;
    }

    @Override
    public List<Detallesdelpedido> getTodasDetallesdelpedidoManual() {
        return detallesdelpedidoRepositorio.traerTodo();
    }
}
