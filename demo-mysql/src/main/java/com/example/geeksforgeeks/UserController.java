package com.example.geeksforgeeks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() throws SQLException {
        return userService.getUsers();

    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) throws SQLException {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public String createUser(@Valid @RequestBody UserRequest userRequest) throws SQLException {
        userService.createUser(userRequest);
        return "User Inserted succesfully";
    }

    @DeleteMapping
    public User deleteUser(@PathVariable int id) throws SQLException {
        return userService.deleteById(id);
    }

    @PutMapping
    public void updateUser(int id, User user) throws SQLException {
        userService.updateUserById(id, user);
    }


}
