package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars = Arrays.asList(
        new Car("Vaz", "Raspberry", 1990),
        new Car("BMW", "Red", 1991),
        new Car("Mercedes-Benz", "White", 1992),
        new Car("Volkswagen", "Blue", 1993),
        new Car("Kia", "Dirty", 1994),
        new Car("Volga", "Black", 1970)
    );
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
