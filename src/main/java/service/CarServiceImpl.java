package service;

import model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> returnQtyOfCar(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 5 , "black"));
        cars.add(new Car("Porshe", 8, "red"));
        cars.add(new Car("Ferarri", 10, "ornange"));
        cars.add(new Car("Mercedes", 6, "white"));
        cars.add(new Car("SKODA", 3, "gold"));
        List<Car> qtyCars = new ArrayList<>();
        if (count > 0 || count >= 5) {
            for (int i = 0; i < count; i++) {
                qtyCars.add(cars.get(i));
            }
        }
        if (count == null) {
            count = cars.size();
        }
        return qtyCars;
    }
}
