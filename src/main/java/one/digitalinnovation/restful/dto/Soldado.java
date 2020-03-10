package one.digitalinnovation.restful.dto;

import lombok.Data;
import one.digitalinnovation.restful.enums.Raca;

@Data
public class Soldado {

    private Long id;
    private String cpf;
    private String nome;
    private Raca raca;
    private String arma;
    private String status;
}
