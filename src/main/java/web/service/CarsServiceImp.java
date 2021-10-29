package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarsDAO;
import web.dao.CarsDAOImp;
import web.model.Car;

import java.util.List;

@Component
public class CarsServiceImp implements CarsService {
    CarsDAO carsDAO = new CarsDAOImp();

    @Override
    public List<Car> getAllCars() {
        return carsDAO.getAllCars();
    }

    @Override
    public List<Car> getNumberOfCars (int count) {
        return carsDAO.getNumberOfCars(count);
    }


}
