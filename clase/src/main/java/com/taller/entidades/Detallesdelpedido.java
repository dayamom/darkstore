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
  private   Long id_Detallesdelpedido;
  private   Long fk_id_Pedido;
  private   Long fk_id_Producto;
  private   Long Cantidad;
  private   float Precio_Unitario;
  private   float Subtotal;
}
