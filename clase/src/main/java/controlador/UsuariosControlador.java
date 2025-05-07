package controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosControlador {

    private final UsuariosServicios usuariosServicios;

    public UsuariosControlador(UsuariosServicios usuariosServicios) {
        this.usuariosServicios = usuariosServicios;
    }

    @GetMapping("/usuarios/manual")
    public List<Usuarios> getUsuariosManual() {
        return usuariosServicios.getTodosUsuariosManual();
    }
}
