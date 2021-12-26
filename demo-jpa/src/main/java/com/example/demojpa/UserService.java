package com.example.demojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public void createUser(UserRequest userRequest) {
        User user = userRequest.toUser();
        userDAO.save(user);
    }

    public User getUser(int id) {
        User user = userDAO.findById(id).orElse(null);
        return user;
    }

    public List<User> getUsers() {
        List<User> users = userDAO.findAll();
        return users;
    }

    public User deleteUser(int id) {
        User user = getUser(id);
        userDAO.deleteById(id);
        return user;
    }
}
