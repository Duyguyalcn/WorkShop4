package oopWithNlayeredRentaCarApp.entities;

public class Car {
    private String carModel;
    private String carBrand;

    private double carPrice;



    public Car() {
    }

    public Car(String carModel,String carBrand,double carPrice) {
        this.carModel = carModel;
        this.carBrand=carBrand;
        this.carPrice=carPrice;


    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }



}
