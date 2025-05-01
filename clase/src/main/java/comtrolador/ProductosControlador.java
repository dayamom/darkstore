package comtrolador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductosControlador {
    private final ProductosServicio empleadoServicio;

    public ProductosControlador(EmpleadoServicio empleadoServicio){
        this.empleadoServicio = empleadoServicio;
    }

    @GetMapping("/empleados")
    public List<Empleado>getEmpleados(){
        return empleadoServicio.getTodosEmpleados();
    }

    @GetMapping("/empleados")
    public List<Empleado>getEmpleadosManual(){
        return empleadoServicio.getTodosEmpleadosManual();
    }

}
