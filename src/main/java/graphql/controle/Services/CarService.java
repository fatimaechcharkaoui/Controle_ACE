package graphql.controle.Services;

import graphql.controle.DTOs.CarDTO;

import java.util.List;


public interface CarService {
    CarDTO saveCar(CarDTO carDTO);
    List<CarDTO> getCarByModel(String model);

}
