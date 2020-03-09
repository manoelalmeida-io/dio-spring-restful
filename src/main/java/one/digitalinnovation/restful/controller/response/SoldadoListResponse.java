package one.digitalinnovation.restful.controller.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Getter @Setter
public class SoldadoListResponse extends RepresentationModel<SoldadoListResponse> {
    private Long id;
    private String nome;
    private String raca;
}
