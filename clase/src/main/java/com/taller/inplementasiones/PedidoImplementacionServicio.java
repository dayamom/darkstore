package com.taller.inplementasiones;

import modelos.entidades.Pedido;
import modelos.entidades.repositorio.PedidoRepositorio;
import org.springframework.stereotype.Service;
import servicio.PedidoServicio;

import java.util.List;

@Service
public class PedidoImplementacionServicio implements PedidoServicio {

    private final PedidoRepositorio pedidoRepositorio;


    public PedidoImplementacionServicio(PedidoRepositorio pedidoRepositorio) {
        this.pedidoRepositorio = pedidoRepositorio;
    }

    @Override
    public List<Pedido> getAllPedidos() {
        return pedidoRepositorio.findAllPedidos();
    }
}