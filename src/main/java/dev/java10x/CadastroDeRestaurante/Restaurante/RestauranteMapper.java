package dev.java10x.CadastroDeRestaurante.Restaurante;

import org.springframework.stereotype.Component;

@Component
public class RestauranteMapper {

    public RestauranteModel map(RestauranteDTO restauranteDTO) {
        RestauranteModel restauranteModel = new RestauranteModel();
        restauranteModel.setId(restauranteDTO.getId());
        restauranteModel.setNome(restauranteDTO.getNome());
        restauranteModel.setCardapios(restauranteDTO.getCardapios());
        restauranteModel.setDoces(restauranteDTO.getDoces());
        restauranteModel.setEmail(restauranteDTO.getEmail());


        return restauranteModel;
    }

    public RestauranteDTO map(RestauranteModel restauranteModel){

         RestauranteDTO restauranteDTO= new RestauranteDTO();
         restauranteDTO.setId(restauranteModel.getId());
         restauranteDTO.setNome(restauranteModel.getNome());
         restauranteDTO.setCardapios(restauranteModel.getCardapios());
         restauranteDTO.setDoces(restauranteModel.getDoces());
         restauranteDTO.setEmail(restauranteModel.getEmail());


         return restauranteDTO;
    }
}
