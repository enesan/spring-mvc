package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {


   private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 200, 1200));
        cars.add(new Car("Mercedes", 160, 1300));
        cars.add(new Car("Fiat", 150, 1400));
        cars.add(new Car("BYD", 140, 1500));
        cars.add(new Car("Toyota", 130, 1600));
    }
    @Override
    public List<Car> getCars(int number) {
        if (number > 5) {
            return cars.subList(0, cars.size());
        } else {
            return cars.subList(0, number);
        }
    }


}
