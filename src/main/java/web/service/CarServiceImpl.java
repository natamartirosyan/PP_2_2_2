package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volvo XC90", 2012, "Sweden"));
        cars.add(new Car("BMW X3", 2017, "Germany"));
        cars.add(new Car("Ford Focus", 2015, "USA"));
        cars.add(new Car("Hyundai Tucson", 2018, "South Korea"));
        cars.add(new Car("Renault Logan", 2020, "France"));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
