package com.taller.inplementasiones;

import modelos.entidades.Detallesdelpedido;
import modelos.entidades.repositorio.DetallesdelpedidoRepositorio;
import org.springframework.stereotype.Service;
import servicio.DetallesdelpedidoServicio;

import java.util.List;
@Service
public abstract class DetallesdelpedidoImplementacionServicio implements DetallesdelpedidoServicio {

    private final DetallesdelpedidoRepositorio detallesdelpedidoRepositorio;


    public DetallesdelpedidoImplementacionServicio(DetallesdelpedidoRepositorio detallesdelpedidoRepositorio) {
        this.detallesdelpedidoRepositorio = detallesdelpedidoRepositorio;
    }

    @Override
    public List<Detallesdelpedido> getAllDetallesdelpedido() {
        return detallesdelpedidoRepositorio.findAllDetallesdelpedido();
    }
}