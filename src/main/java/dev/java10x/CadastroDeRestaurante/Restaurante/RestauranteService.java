package dev.java10x.CadastroDeRestaurante.Restaurante;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hibernate.Hibernate.map;

@Service
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;
    private final RestauranteMapper restauranteMapper;

    public RestauranteService(RestauranteRepository restauranteRepository, RestauranteMapper restauranteMapper) {
        this.restauranteRepository = restauranteRepository;
        this.restauranteMapper = restauranteMapper;
    }

    public List<RestauranteDTO> listarRestaurantes() {
        List<RestauranteModel> restaurantes =restauranteRepository.findAll();
        return  restaurantes.stream()
        .map(restauranteMapper::map)
        .collect(Collectors.toList());
    }

    public RestauranteDTO listarRestaurantesPorId(Long id) {
        Optional<RestauranteModel> restaurantePorId = restauranteRepository.findById(id);
        return restaurantePorId.map(restauranteMapper::map).orElse(null);


    }

    public RestauranteDTO criarRestaurante(RestauranteDTO restauranteDTO) {
        RestauranteModel restaurante= restauranteMapper.map(restauranteDTO);
        restaurante= restauranteRepository.save(restaurante);
        return restauranteMapper.map(restaurante);



    }


    public void deletarRestaurantePorId(Long id) {
        restauranteRepository.deleteById(id);
    }


    public RestauranteDTO atualizarRestaurante(Long id, RestauranteDTO restauranteDTO){
       Optional<RestauranteModel> restauranteExistente= restauranteRepository.findById(id);
       if(restauranteExistente.isPresent()){
           RestauranteModel restauranteAtualizado= restauranteMapper.map(restauranteDTO);
           restauranteAtualizado.setId(id);
           RestauranteModel restauranteSalvo= restauranteRepository.save(restauranteAtualizado);
           return restauranteMapper.map(restauranteSalvo);

        }
      return null;
    }

}


