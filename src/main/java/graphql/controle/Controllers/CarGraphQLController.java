package graphql.controle.Controllers;

import graphql.controle.DTOs.CarDTO;
import graphql.controle.Services.CarService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class CarGraphQLController {
   /* private final CarService carService;

    @Autowired
    public CarGraphQLController(CarService carService) {
        this.carService = carService;
    }

    @QueryMapping
    public List<CarDTO> getCarByModel(@NonNull @Argument String model) {
        return carService.getCarByModel(model);
    }

    @MutationMapping
    public CarDTO saveCar(@NonNull @Argument CarDTO car) {
        return carService.saveCar(car);
    }*/
}
