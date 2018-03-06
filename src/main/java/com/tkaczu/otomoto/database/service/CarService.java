package com.tkaczu.otomoto.database.service;

import com.tkaczu.otomoto.database.model.Car;

public class CarService {
    public Car createNewCar(String mark, String model, String year, String mileage, String vin) {
        Car car = new Car();
        car.setMark(mark);
        car.setModel(model);
        car.setYear(year);
        car.setMileage(mileage);
        car.setVin(vin);
        return car;
    }
}
