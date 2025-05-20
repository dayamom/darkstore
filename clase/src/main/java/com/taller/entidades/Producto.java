package com.taller.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Productos;
    private String nombre_p;
    private float Precio_p;
    private Long Stock_p;
    private Long fk_id_Categoria;
    private Long fk_id_Marca;
}