package com.tkaczu.otomoto.database.repository;

import com.tkaczu.otomoto.database.model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class CarRepository {
    public static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public List<Car> getAll(SessionFactory factory) {
        try (Session session = factory.openSession()) {
            Query<Car> q = session.createQuery("FROM Car");
            return q.getResultList();


        }
    }
}