package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImp;

@Controller
public class CarsController {

    private CarsServiceImp carsServiceImp;

    @Autowired
    public CarsController(CarsServiceImp carsServiceImp) {
        this.carsServiceImp = carsServiceImp;
    }

    @GetMapping("/cars")
    public String getNumberOfCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count == null || count > 4) {
            model.addAttribute("count", carsServiceImp.getAllCars());
        } else {
            model.addAttribute("count", carsServiceImp.getNumberOfCars(count));
        }
        return "cars";
    }
}
