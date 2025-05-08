package controlador;

import modelos.entidades.Pedido;
import modelos.entidades.Usuario;
import modelos.entidades.Pedido;
import org.springframework.http.ResponseEntity;
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
    public List<Pedido> getPedidosManual() {
        return pedidoServicio.getAllPedidos();
    }
}