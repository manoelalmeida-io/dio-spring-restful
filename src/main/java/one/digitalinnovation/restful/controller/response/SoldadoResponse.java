package one.digitalinnovation.restful.controller.response;

import lombok.Data;

@Data
public class SoldadoResponse {

    private Long id;
    private String cpf;
    private String nome;
    private String raca;
    private String arma;
}
