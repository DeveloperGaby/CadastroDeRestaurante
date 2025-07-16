package dev.java10x.CadastroDeRestaurante.Restaurante;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RestauranteController {

    //metodo http que ele escuta é o Get
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Eu sou uma grande Desenvolvedora java";
    }

    //adicionar restaurante CREATE
    @PostMapping("/criar")
    public String criarRestaurante(){
        return  "Restaurante Criado";
    }

    //mostrar todos os restaurantes READ
    @GetMapping("/todos")
    public String mostrarTodosOsRestaurantes(){
        return  " Mostrar Restaurantes";
    }

   // mostrar restaurante por ID READ

   @GetMapping("/todosID")
    public String mostrarTodosOsRestaurantesPorId(){
        return  "Mostrar Restaurante Por ID";
   }

   // Alterar Dados dos Restaurantes UPDATE
    @PutMapping("/alterarID")
    public String alterarRestaurantePorId(){
        return "Mostrar restaurante Por ID";
    }

   //deletar restaurante por ID DELETE
    @DeleteMapping("/deletarID")
    public String deletarRestaurantePorId(){
        return " Deletar Restaurante Por ID";


    }


}
