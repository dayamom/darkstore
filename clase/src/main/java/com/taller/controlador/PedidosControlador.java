package com.taller.controlador;

import com.taller.entidades.Pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.taller.servicio.PedidoServicio;

import java.util.List;

@RestController
public class PedidosControlador {

    private final PedidoServicio pedidoServicio;

    public PedidosControlador(PedidoServicio pedidoServicio) {
        this.pedidoServicio = pedidoServicio;
    }

    @GetMapping("/pedidos/manual")
    public List<Pedido> getPedidosManual() {
        return pedidoServicio.getAllPedidos();
    }
}