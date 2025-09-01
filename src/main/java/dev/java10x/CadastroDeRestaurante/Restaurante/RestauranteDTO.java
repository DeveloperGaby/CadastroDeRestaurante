package dev.java10x.CadastroDeRestaurante.Restaurante;

import dev.java10x.CadastroDeRestaurante.Cardapios.CardapiosModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteDTO {

    private Long id;
    private String nome;
    private String email;
    private String doces;
    private CardapiosModel cardapios;
}
