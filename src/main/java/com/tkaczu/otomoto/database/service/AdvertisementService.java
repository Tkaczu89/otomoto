package com.tkaczu.otomoto.database.service;

import com.tkaczu.otomoto.database.model.Advertisement;
import com.tkaczu.otomoto.database.model.Car;
import com.tkaczu.otomoto.database.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AdvertisementService {

    public Advertisement createNewAdvertisement(String description, Integer price) {
        Advertisement advertisement = new Advertisement();
        advertisement.setDescription(description);
        advertisement.setPrice(price);
        return advertisement;
    }

    public void insertNewAdvertisement(SessionFactory factory, Advertisement advertisement, Car car, User user) {
        advertisement.setCar(car);
        advertisement.setUser(user);
        try (Session session = factory.openSession()) {
            Transaction trans = null;
            try {
                trans = session.beginTransaction();
                session.save(advertisement);
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
