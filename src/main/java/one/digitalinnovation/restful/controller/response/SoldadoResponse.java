package one.digitalinnovation.restful.controller.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Getter @Setter
public class SoldadoResponse extends RepresentationModel<SoldadoResponse> {

    private Long id;
    private String cpf;
    private String nome;
    private String raca;
    private String arma;
    private String status;
}
