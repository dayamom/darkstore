package modelos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id_pedidos;
    String nombre_p;
    Long fk_id_Usuarios;
    LocalDateTime fecha_pedido;
    BigDecimal total_p;
}
