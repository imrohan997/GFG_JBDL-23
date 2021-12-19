package com.example.geeksforgeeks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    DemoService demoService;


    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        String message = demoService.createUser(user);
        logger.info(message);
        logger.info(demoService+"");
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        User user = demoService.getUser(id);
        if (user == null) {
            logger.info("User is not absent");
        } else {
            logger.info("User is present");
        }
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return demoService.getUsers();
    }
}
