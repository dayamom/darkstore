package controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarcasControlador {
    private final MarcasServicio MarcasServicio;

    public MarcasControlador (MarcasServicio MarcasServisio){
        this.MarcasServicio = MarcasServisio;
    }

    @GetMapping("/Marcas/manual")
    public List<Marcas> getMarcasManual() {
        return MarcasServicio.getTodasMarcasManual();
    }
}
