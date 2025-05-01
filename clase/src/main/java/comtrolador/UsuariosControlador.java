package comtrolador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosControlador {
    private final UsuariosServicios usuariosServicios;


    public  UsuariosServicios (UsuariosServicios usuariosServicios) {
        this.usuariosServicios = usuariosServicios;
    }

    @GetMapping("/Usuarios")
    public List<Usuarios> getusuarios(){
        return usuariosServicios.getTodosUsuarios();
    }

    @GetMapping("/Usuarios/manual")
    public List<Usuarios> getUsuariosManual(){
        return usuariosServicios.getTodosUsuariosManual();
    }


}
