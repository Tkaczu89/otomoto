package com.tkaczu.otomoto.database.service;

import com.tkaczu.otomoto.database.model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CarService {

    public void insertNewCar(SessionFactory factory, String mark, String model) {
        Car car = new Car();
        car.setMark(mark);
        car.setModel(model);
        try (Session session = factory.openSession()) {
            Transaction trans = null;
            try {
                trans = session.beginTransaction();
                session.save(car);
                trans.commit();
            } catch (RuntimeException e) {
                if (trans != null) {
                    trans.rollback();
                }
                e.printStackTrace();
            }


        }
    }
}
