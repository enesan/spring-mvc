package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{

    CarDao carDao;

    @Override
    public List<Car> getCars(int number){
        return  carDao.getCars(number);
    }
}
