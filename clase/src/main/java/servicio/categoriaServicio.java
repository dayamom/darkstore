package servicio;

import modelos.entidades.Categoria;
import modelos.entidades.Usuario;
import modelos.entidades.pedido;

import java.util.List;

public interface categoriaServicio {


    List<Usuario> getTodascategoriaManual();

    List<Categoria> getAllcategoria();
}
