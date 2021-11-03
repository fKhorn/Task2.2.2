package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.dao.CarsDAOImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServiceImp implements CarsService {
//    CarsDAO carsDAO = new CarsDAOImp();
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Mercedes", "E 300"));
        cars.add(new Car(2, "BMW", "X6"));
        cars.add(new Car(3, "Mitsubishi", "Eclipse"));
        cars.add(new Car(4, "Mazda", "CX-9"));
        cars.add(new Car(5, "Nissan", "X-Trail"));
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
