package com.example.demorestapis;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class UserController {

    HashMap<Integer, User> map = new HashMap<>();


    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        map.put(user.getId(), user);
    }


    @PostMapping("/user2")
    public void createUser(@RequestParam int id, @RequestParam String name, @RequestParam int age) {
        map.put(id, new User(id, name, age));
    }

    @GetMapping("/user")
    public User getUser(@RequestBody Integer id) {
        return map.get(id);
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable int id) {
        return map.remove(id);
    }

    @PutMapping("/user")
    public User updateUser(@RequestParam int id, @RequestBody User user) {
        map.put(id, user);

//        User retrievedUser = map.get(id);
//        if (user.getId() != null) {
//            retrievedUser.setId(user.getId());
//        }
//        if (user.getName() != null) {
//            retrievedUser.setName(user.getName());
//        }
//        if (user.getAge() != null) {
//            retrievedUser.setAge(user.getAge());
//        }
        return map.get(id);
    }


}
