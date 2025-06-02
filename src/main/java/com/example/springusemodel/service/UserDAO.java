package com.example.springusemodel.service;

import com.example.springusemodel.model.Login;
import com.example.springusemodel.model.User;
import jdk.jpackage.internal.Log;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("john", "123456", "John", "john@codegym.vn", 18));
        users.add(new User("bill", "123456", "Bill", "bill@codegym.vn", 20));
        users.add(new User("mike", "123456", "Mike", "mike@codegym.vn", 22));
    }

    public static User checkLogin(Login entities) {
        for (User item : users) {
            if (item.getAccount().equals(entities.getAccount())
                    && item.getPassword().equals(entities.getPassword())) {
                return item;
            }
        }
        return null;
    }

}
