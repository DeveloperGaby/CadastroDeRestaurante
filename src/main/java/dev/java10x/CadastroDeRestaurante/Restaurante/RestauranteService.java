package dev.java10x.CadastroDeRestaurante.Restaurante;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteService {

    private RestauranteRepository restauranteRepository;
    private RestauranteMapper restauranteMapper;

    public RestauranteService(RestauranteRepository restauranteRepository, RestauranteMapper restauranteMapper) {
        this.restauranteRepository = restauranteRepository;
        this.restauranteMapper = restauranteMapper;
    }

    public List<RestauranteModel> listarRestaurantes() {

        return restauranteRepository.findAll();
    }

    public RestauranteModel listarRestaurantesPorId(Long id) {
        Optional<RestauranteModel> restaurantePorId = restauranteRepository.findById(id);
        return restaurantePorId.orElse(null);


    }

    public RestauranteDTO criarRestaurante(RestauranteDTO restauranteDTO) {
        RestauranteModel restaurante= restauranteMapper.map(restauranteDTO);
        restaurante= restauranteRepository.save(restaurante);
        return restauranteMapper.map(restaurante);



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


