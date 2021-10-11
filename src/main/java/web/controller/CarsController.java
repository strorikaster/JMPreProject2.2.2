package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model) {
         //cars = new ArrayList<>();
        //count = 5;
        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> qtyCars = carsServiceImpl.returnQtyOfCar(count);
        model.addAttribute("cars", qtyCars);
        return "cars";
    }
}
