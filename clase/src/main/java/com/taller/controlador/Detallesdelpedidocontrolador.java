package com.taller.controlador;

import com.taller.entidades.Detallesdelpedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.taller.servicio.DetallesdelpedidoServicio;

import java.util.List;
@RestController
public class Detallesdelpedidocontrolador {
    private final DetallesdelpedidoServicio detallesDelPedidoServicio;

    public Detallesdelpedidocontrolador(DetallesdelpedidoServicio detallesDelPedidoServicio) {
        this.detallesDelPedidoServicio = detallesDelPedidoServicio;
    }

    @GetMapping("/detallesdelpedido/manual")
    public List<Detallesdelpedido> getDetallesDelPedidoManual() {
        return detallesDelPedidoServicio.getAllDetallesdelpedido();
    }
}
