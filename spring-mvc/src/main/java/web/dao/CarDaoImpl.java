package web.dao;

import web.model.Car;

import java.util.List;

public class CarDaoImpl implements CarDao{

    List<Car> cars;

    @Override
    public List<Car> getCars(int number){
        cars.add(new Car("BMW", 200, 1200));
        cars.add(new Car("Mercedes", 160, 1300));
        cars.add(new Car("Fiat", 150, 1400));
        cars.add(new Car("BYD", 140, 1500));
        cars.add(new Car("Toyota", 130, 1600));

        return cars.subList(0, number);
    }
}
