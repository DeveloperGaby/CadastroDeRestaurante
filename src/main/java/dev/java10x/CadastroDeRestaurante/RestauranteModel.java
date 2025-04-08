package dev.java10x.CadastroDeRestaurante;

import jakarta.persistence.*;

// entity ele transforma uma classe em entidade do banco de dados
// JPA java persistence API
@Entity
@Table(name="tb_cadastro")
public class RestauranteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String nome;
    private String email;


    public RestauranteModel() {
    }


    public RestauranteModel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
