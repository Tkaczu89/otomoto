package com.tkaczu.otomoto.database.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CarRepository {
    public static SessionFactory factory = new Configuration().configure().buildSessionFactory();
}
