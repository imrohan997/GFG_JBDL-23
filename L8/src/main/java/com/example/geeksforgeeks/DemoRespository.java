package com.example.geeksforgeeks;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DemoRespository {

    List<User> list = new ArrayList<>();

    public User getUser(Integer id) {
        for (int i = 0; i < list.size(); ++i) {
            User user = list.get(i);
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void createUser(User user) {
        list.add(user);
    }

    public List<User> getUsers() {
        return list;
    }



}
