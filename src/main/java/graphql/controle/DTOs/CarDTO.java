package graphql.controle.DTOs;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CarDTO {
    private String model;
    private String color;
    private String matricul;
    private Double price;


}