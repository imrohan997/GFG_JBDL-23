package com.example.geeksforgeeks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void createUser(UserRequest userRequest) throws SQLException {
        User user = userRequest.toUser();
        userDAO.createUser(user);

    }

    public List<User> getUsers() throws SQLException {
        return userDAO.getUsers();
    }

    public User getUserById(int id) throws SQLException {
        return userDAO.getUserById(id);
    }

    public User deleteById(int id) throws SQLException {
        return userDAO.deleteUserById(id);
    }

    public void updateUserById(int id, User user) throws SQLException {
        userDAO.updateUserById(id, user);
    }

}
