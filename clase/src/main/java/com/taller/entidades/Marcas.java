package com.taller.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "marcas")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Marcas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;
    private String nombre_marca;

}
