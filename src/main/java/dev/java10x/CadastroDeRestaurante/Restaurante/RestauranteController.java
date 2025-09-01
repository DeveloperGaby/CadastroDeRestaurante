package dev.java10x.CadastroDeRestaurante.Restaurante;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    private RestauranteService restauranteService;

    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }
    //metodo http que ele escuta é o Get
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Eu sou uma grande Desenvolvedora java";
    }
    //adicionar restaurante CREATE
    @PostMapping("/criar")
    public RestauranteDTO  criarRestaurante(@RequestBody RestauranteDTO restauranteDTO) {
        return restauranteService.criarRestaurante(restauranteDTO);
    }
    //mostrar todos os restaurantes READ
    @GetMapping("/listar")
    public List<RestauranteModel> listarRestaurantes() {
        return restauranteService.listarRestaurantes();
    }

    // mostrar restaurante por ID READ
    @GetMapping("/listar/{id}")
    public RestauranteModel listarRestaurantesPorId(@PathVariable Long id) {
        return restauranteService.listarRestaurantesPorId(id) ;
    }
    // Alterar Dados dos Restaurantes UPDATE
    @PutMapping("/alterar/{id}")
    public RestauranteModel alterarRestaurantePorId(@PathVariable Long id,@RequestBody RestauranteModel restauranteAtualizado) {
        return restauranteService.atualizarRestaurante(id,restauranteAtualizado);
    }
    //deletar restaurante por ID DELETE
    @DeleteMapping("/deletar/{id}")
    public void deletarRestaurantePorId(@PathVariable Long id){
        restauranteService.deletarRestaurantePorId(id);
    }
}
