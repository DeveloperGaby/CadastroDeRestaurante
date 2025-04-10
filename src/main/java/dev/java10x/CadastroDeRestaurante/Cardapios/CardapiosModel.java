package dev.java10x.CadastroDeRestaurante.Cardapios;

import dev.java10x.CadastroDeRestaurante.Restaurante.Controller.RestauranteModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_cardapios")
public class CardapiosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDoPrato1;
    private String nomeRestaurante;

   //@OneToMany um cardapio pode ter varios restaurantes
   @OneToMany(mappedBy = "cardapios")
    private List <RestauranteModel> restauranteModel;


}





