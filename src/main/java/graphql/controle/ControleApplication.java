package graphql.controle;

import graphql.controle.DAO.Entities.Car;
import graphql.controle.DAO.Repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }
    @Bean
    CommandLineRunner initDatabase(CarRepository carRepository) {
        return args -> {
            if (carRepository.count() == 0) {
                carRepository.save(new Car(null, "Boeing 737", "White", "BOE123", 120000000.0));
                carRepository.save(new Car(null, "Airbus A320", "Blue", "AIR456", 95000000.0));
                carRepository.save(new Car(null, "Cessna 172", "Red", "CES789", 250000.0));
                carRepository.save(new Car(null, "Gulfstream G650", "Black", "GUL101", 65000000.0));
                System.out.println("Base de données initialisée avec des avions.");
            }
        };
    }

}
