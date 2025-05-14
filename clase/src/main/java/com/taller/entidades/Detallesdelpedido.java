package com.taller.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detallesdelpedido")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Detallesdelpedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Detallesdelpedido;
    String nombre_p;
    Long fk_id_Pedido;
    Long fk_id_Producto;
    Long Cantidad;
    float Precio_Unitario;
    float Subtotal;
}
