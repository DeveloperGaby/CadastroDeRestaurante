package dev.java10x.CadastroDeRestaurante.Restaurante.Controller;

import dev.java10x.CadastroDeRestaurante.Cardapios.CardapiosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// entity ele transforma uma classe em entidade do banco de dados
// JPA java persistence API
@Entity
@Table(name="tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestauranteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    //@ManyToOne um restaurante pode ter varios cardapios
    @ManyToOne
    @JoinColumn(name = "cardapios_id")// Foreing key ou chave estrangeira
    private CardapiosModel cardapios;


}