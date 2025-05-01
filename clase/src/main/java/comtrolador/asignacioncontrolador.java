package comtrolador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AsignacionControlador {
    private final AsignacionServicio AsignacionServicio;

    public Asignasioncontrolador(AsignacionServicio asignacionServicio){
        this .AsignacionServicio = asignacionServicio;
    }

    @GetMapping ("/asignaciones")
    public List<Asignacion>getAsignacionesmanual(){

        return asignacionServicio.getTodasAsignacionesManual();
    }

    @GetMapping("/asignacionesManual")
    public List<Asignacion> getAsignacionesManual(){
        return asignasionServicio.getTodasAsignacionesManual();
    }
}
