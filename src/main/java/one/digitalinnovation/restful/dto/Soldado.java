package one.digitalinnovation.restful.dto;

import lombok.Data;

@Data
public class Soldado {

    private Long id;
    private String cpf;
    private String nome;
    private String raca;
    private String arma;
    private String status;
}
