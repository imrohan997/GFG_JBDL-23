package com.example.demojpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String createUser(@Valid @RequestBody UserRequest userRequest) {
        userService.createUser(userRequest);
        return "User inserted";
    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        User user = userService.getUser(id);
        logger.info(String.valueOf(user));
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = userService.getUsers();
        return users;
    }

    @DeleteMapping("/userc")
    public User deleteUserById(@RequestParam int id) {
        User user = userService.deleteUser(id);
        return user;
    }


}
