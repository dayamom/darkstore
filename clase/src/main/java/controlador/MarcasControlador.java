package controlador;

import modelos.entidades.marca;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.marcasServicio;

import java.util.List;

@RestController
public class MarcasControlador {
    private final marcasServicio MarcasServicio;

    public MarcasControlador (marcasServicio MarcasServisio){
        this.MarcasServicio = MarcasServisio;
    }

    @GetMapping("/Marcas/manual")
    public List<marca> getMarcasManual() {
        return MarcasServicio.getTodasmarcaManual();
    }
}
