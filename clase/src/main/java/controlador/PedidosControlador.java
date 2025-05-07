package controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidosControlador {

    private final PedidosServicio PedidosServicio;

    public PedidosControlador(PedidosServicio PedidosServicio) {
        this.PedidosServicio = PedidosServicio;
    }


    @GetMapping("/asignaciones/manual")
    public List<Pedidos> getPedidosManual() {
        return PedidosServicio.getTodasPedidosManual();
    }
}

