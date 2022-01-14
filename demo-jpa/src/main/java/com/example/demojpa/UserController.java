package com.example.demojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/user")
    public User createUser(@Valid @RequestBody UserRequest userRequest) {
        return userService.createUser(userRequest);

    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        return userService.getUser(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam int id) {
        userService.deleteUser(id);
    }
}
