package graphql.controle.Services;

import graphql.controle.DAO.Entities.Car;
import graphql.controle.DAO.Repositories.CarRepository;
import graphql.controle.DTOs.CarDTO;
import graphql.controle.Mappers.CarMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarManager implements CarService {


    private final CarRepository carRepository;
    private final CarMapper carMapper;


    @Override
    public List<CarDTO> getCarByModel(String model) {
        return carRepository.findByModel(model)
                .stream()
                .map(carMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car = carMapper.toEntity(carDTO);
        Car savedCar = carRepository.save(car);
        return carMapper.toDTO(savedCar);
    }



}
