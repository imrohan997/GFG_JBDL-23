package com.example.geeksforgeeks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class DemoService {

    //com.example.geeksforgeeks.DemoService@1816a74f
    //com.example.geeksforgeeks.DemoService@1816a74f
    @Autowired
    DemoRespository demoRespository;

    public String createUser(User user) {
        User getUser = demoRespository.getUser(user.getId());
        if (getUser != null) {
            return "User id already present";
        }
        demoRespository.createUser(user);
        return "User is inserted";
    }

    public User getUser(Integer id) {
        User user = demoRespository.getUser(id);
        return user;
    }

    public List<User> getUsers() {
        return demoRespository.getUsers();
    }
}

