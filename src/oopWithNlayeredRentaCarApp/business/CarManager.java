package oopWithNlayeredRentaCarApp.business;

import oopWithNlayeredRentaCarApp.core.logging.Logger;
import oopWithNlayeredRentaCarApp.dataAccess.CarDao;
import oopWithNlayeredRentaCarApp.dataAccess.JdbcCarDao;
import oopWithNlayeredRentaCarApp.entities.Car;

public class CarManager {
    private CarDao carDao;
    private Logger[] loggers;
    public CarManager(CarDao carDao,Logger[]loggers){
        this.carDao=carDao;
        this.loggers=loggers;
    }
    public void add(Car car) throws Exception {
        if (car.getCarPrice()<200){
       throw new Exception("Ürün fiyatı 200den küçük olamaz");
        }

        carDao.add(car);
        for (Logger logger:loggers) {
            logger.log(car.getCarModel());

        }

        }





    }
