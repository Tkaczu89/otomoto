package com.tkaczu.otomoto.database.service;

import com.tkaczu.otomoto.database.model.User;

public class UserService {
    public User createNewUser(String firstName, String lastName) {
        User user = new User();
        user.setUserFirstName(firstName);
        user.setUserLastName(lastName);
        return user;


    }
}
