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
Long id_Productos;
String nombre_p;
float Precio_p;
Long Stock_p;
Long fk_id_Categoria;
Long fk_id_Marca;
}