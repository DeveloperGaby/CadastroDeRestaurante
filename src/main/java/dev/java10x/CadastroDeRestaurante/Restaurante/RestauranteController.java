package dev.java10x.CadastroDeRestaurante.Restaurante;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class RestauranteController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Eu sou uma grande Desenvolvedora java";
    }
}
