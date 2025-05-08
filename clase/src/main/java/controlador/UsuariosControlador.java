package controlador;

import modelos.entidades.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.UsuarioServicio;

import java.util.List;

@RestController
public class UsuariosControlador {

    private final UsuarioServicio usuarioServicio;

    public UsuariosControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @GetMapping("/usuarios/manual")
    public List<Usuario> getUsuariosManual() {
        return usuarioServicio.getTodasUsuarioManual();
    }
}
