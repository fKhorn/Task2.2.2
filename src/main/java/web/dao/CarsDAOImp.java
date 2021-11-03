package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarsDAOImp implements CarsDAO {
    private static long CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Mercedes", "E 300"));
        cars.add(new Car(++CAR_COUNT, "BMW", "X6"));
        cars.add(new Car(++CAR_COUNT, "Mitsubishi", "Eclipse"));
        cars.add(new Car(++CAR_COUNT, "Mazda", "CX-9"));
        cars.add(new Car(++CAR_COUNT, "Nissan", "X-Trail"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getNumberOfCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
