package com.tkaczu.otomoto.database.repository;

import com.tkaczu.otomoto.database.model.Advertisement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class AdvertisementsRepository {
    public List<Advertisement> getAll(SessionFactory factory) {
        try (Session session = factory.openSession()) {
            Query<Advertisement> q = session.createQuery("FROM Advertisement");
            return q.getResultList();
        }
    }
}
