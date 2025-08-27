package dev.java10x.CadastroDeRestaurante.Restaurante;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteService {

    private RestauranteRepository restauranteRepository;

    public RestauranteService(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public List<RestauranteModel> listarRestaurantes() {

        return restauranteRepository.findAll();
    }

    public RestauranteModel listarRestaurantesPorId(Long id) {
        Optional<RestauranteModel> restaurantePorId = restauranteRepository.findById(id);
        return restaurantePorId.orElse(null);


    }

    public RestauranteModel criarRestaurante(RestauranteModel restaurante) {
        return restauranteRepository.save(restaurante);


    }


    public void deletarRestaurantePorId(Long id) {
        restauranteRepository.deleteById(id);
    }


    public RestauranteModel atualizarRestaurante(Long id, RestauranteModel restauranteAtualizado){
        if(restauranteRepository.existsById(id)){
            restauranteAtualizado.setId(id);
        return  restauranteRepository.save(restauranteAtualizado);

        }
      return null;
    }

}


