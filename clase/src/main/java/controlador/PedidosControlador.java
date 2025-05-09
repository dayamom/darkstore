package controlador;

import modelos.entidades.pedido;
import modelos.entidades.pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.PedidoServicio;

import java.util.List;

@RestController
public class PedidosControlador {

    private final PedidoServicio pedidoServicio;


    public PedidosControlador(PedidoServicio pedidoServicio) {
        this.pedidoServicio = pedidoServicio;
    }


    @GetMapping("/pedidos/manual")
    public List<pedido> getPedidosManual() {
        return pedidoServicio.getAllPedidos();
    }
}