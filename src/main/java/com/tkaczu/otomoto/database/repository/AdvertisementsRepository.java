package com.tkaczu.otomoto.database.repository;

import com.tkaczu.otomoto.database.model.Advertisement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class AdvertisementsRepository {
    public static SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Query<Advertisement> q;

    public List<Advertisement> getAll(SessionFactory factory) {
        try (Session session = factory.openSession()) {
            q = session.createQuery("FROM Advertisement");
            return q.getResultList();
        }
    }

    public List<Advertisement> getAllSorted(SessionFactory factory, String orderElement, String sort) {
        try (Session session = factory.openSession()) {
            switch (sort) {
                case "desc":
                    q = session.createQuery("FROM Advertisement a ORDER BY " + orderElement + " DESC");
                    return q.getResultList();
                case "asc":
                    q = session.createQuery("FROM Advertisement a ORDER BY " + orderElement + " ASC");
                    return q.getResultList();
                default:
                    q = session.createQuery("FROM Advertisement");
                    return q.getResultList();
            }
        }
    }
}

