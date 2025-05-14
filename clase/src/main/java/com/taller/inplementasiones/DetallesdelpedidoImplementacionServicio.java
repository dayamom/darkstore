package com.taller.inplementasiones;

import com.taller.entidades.Detallesdelpedido;
import com.taller.entidades.repositorio.DetallesdelpedidoRepositorio;
import org.springframework.stereotype.Service;
import com.taller.servicio.DetallesdelpedidoServicio;

import java.util.List;

@Service
public class DetallesdelpedidoImplementacionServicio implements DetallesdelpedidoServicio {

    private final DetallesdelpedidoRepositorio detallesdelpedidoRepositorio;


    public DetallesdelpedidoImplementacionServicio(DetallesdelpedidoRepositorio detallesdelpedidoRepositorio) {
        this.detallesdelpedidoRepositorio = detallesdelpedidoRepositorio;
    }

    @Override
    public List<Detallesdelpedido> getAllDetallesdelpedido() {
        return detallesdelpedidoRepositorio.findAllDetallesdelpedido();
    }
}
