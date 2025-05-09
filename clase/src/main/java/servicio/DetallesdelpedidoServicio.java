package servicio;

import modelos.entidades.Detallesdelpedido;

import java.util.List;

public interface DetallesdelpedidoServicio {
    List<Detallesdelpedido> getAllDetallesdelpedido();

    void getTodasDetallesdelpedidoManual();
}

