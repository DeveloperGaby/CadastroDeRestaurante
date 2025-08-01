package dev.java10x.CadastroDeRestaurante.Cardapios;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {


    //metodo http que ele escuta é o Get
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Eu sou uma grande Desenvolvedora java";
    }

    //adicionar Cardapio CREATE
    @PostMapping("/criar")
    public String criarCardapio() {
        return "Cardapio Criado";
    }

    //mostrar todos os Cardapio READ
    @GetMapping("/todos")
    public String mostrarTodosOsCardapios() {
        return " Mostrar Cardapio";
    }

    // mostrar Cardapio por ID READ

    @GetMapping("/todosID")
    public String mostrarTodosOsCardapiosPorId() {
        return "Mostrar Restaurante Por ID";
    }

    // Alterar Dados dos Cardapio UPDATE
    @PutMapping("/alterarID")
    public String alterarCardapioPorId() {
        return "Alterar Cardapio Por ID";

    }

    //deletar Cardapio por ID DELETE
    @DeleteMapping("/deletarID")
    public String deletarCardapioPorId(){
        return " Deletar Cardapio Por ID";


    }






}
