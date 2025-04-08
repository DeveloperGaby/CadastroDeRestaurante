package dev.java10x.CadastroDeRestaurante;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class RestauranteController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa e a minha primeira mensagem nessa rota";
    }
}
