package oopWithNlayeredRentaCarApp;

import oopWithNlayeredRentaCarApp.business.CarManager;
import oopWithNlayeredRentaCarApp.core.logging.DatabaseLogger;
import oopWithNlayeredRentaCarApp.core.logging.FileLogger;
import oopWithNlayeredRentaCarApp.core.logging.Logger;
import oopWithNlayeredRentaCarApp.core.logging.MailLogger;
import oopWithNlayeredRentaCarApp.dataAccess.JdbcCarDao;
import oopWithNlayeredRentaCarApp.entities.Car;

public class Main {
    public static void main(String[]args) throws Exception {
        Car car1 = new Car( "golf", "volswagen",300);
        Logger[]loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};
        CarManager carManager = new CarManager(new JdbcCarDao(),loggers);
        carManager.add(car1);


    }


}
