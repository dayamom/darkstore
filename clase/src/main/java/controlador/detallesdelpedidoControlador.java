package controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Detallesdelpedidocontrolador {
    private final DetallesDelPedidoServicio detallesDelPedidoServicio;

    public Detallesdelpedidocontrolador(DetallesDelPedidoServicio detallesDelPedidoServicio) {
        this.detallesDelPedidoServicio = detallesDelPedidoServicio;
    }

    @GetMapping("/detallesdelpedido/manual")
    public List<DetallesDelPedido> getDetallesDelPedidoManual() {
        return detallesDelPedidoServicio.getTodasDetallesDelPedidoManual();
    }
}
