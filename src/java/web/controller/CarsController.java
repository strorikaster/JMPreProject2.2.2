package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarService;
import service.CarServiceImpl;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {

    private CarService carsService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, HttpServletRequest req) {

        List<Car> findedCars;

        String requestedCount = req.getParameter("count");

        if(requestedCount == null || Integer.parseInt(requestedCount)  >= 5) {
            findedCars = carsService.returnQtyOfCar(5);
        } else {
            findedCars = carsService.returnQtyOfCar(Integer.parseInt(requestedCount));
        }

        model.addAttribute("cars", findedCars);
        return "cars";
    }
}
