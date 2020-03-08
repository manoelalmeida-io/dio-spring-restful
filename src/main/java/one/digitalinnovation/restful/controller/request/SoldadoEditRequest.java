package one.digitalinnovation.restful.controller.request;

import lombok.Data;

@Data
public class SoldadoEditRequest {

    private String cpf;
    private String nome;
    private String raca;
    private String arma;
    private String status;
}
