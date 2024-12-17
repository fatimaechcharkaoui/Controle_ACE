package graphql.controle.Mappers;

import graphql.controle.DAO.Entities.Car;
import graphql.controle.DTOs.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Car toEntity(CarDTO carDTO) {
        return mapper.map(carDTO, Car.class); }
    public CarDTO toDTO(Car car) {
        if (car == null) {
            return null;
        }
        return mapper.map(car, CarDTO.class);
    }
}