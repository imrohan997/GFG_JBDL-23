package com.example.geeksforgeeks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController2 {

    private static final Logger logger = LoggerFactory.getLogger(DemoController2.class);

    @Autowired
    DemoService demoService;

    @GetMapping("/user2")
    public void showInstance() {
        logger.info(demoService+"");
    }


}
