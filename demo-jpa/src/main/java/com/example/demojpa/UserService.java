package com.example.demojpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDAO userDAO;


    public User createUser(UserRequest userRequest) {
        User user = userRequest.toUser();
        User savedUser = userDAO.save(user);
        logger.info(savedUser + "");
        return savedUser;
    }

    public User getUser(int id) {
        User user = userDAO.findById(id).orElse(null);
        return user;
    }

    public List<User> getUsers() {
        return userDAO.findAll();
    }

    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }
}
