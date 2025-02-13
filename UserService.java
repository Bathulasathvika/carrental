package com.sathvika.carrental.service;

import com.sathvika.carrental.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        initializeData();
    }

    private void initializeData() {
        users.add(new User("Sathvika", "Sathvika@16", true));
        users.add(new User("Aruna", "Aruna@04", true));
        users.add(new User("sainihal", "Sainihal@12", true));
        users.add(new User("Narsing", "Narsing@11", false));
        users.add(new User("Abhi", "Abhi@12", false));
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
