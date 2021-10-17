package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> returnQtyOfCar(Integer count) {
        return carDao.returnQtyOfCar(count);
    }
}
