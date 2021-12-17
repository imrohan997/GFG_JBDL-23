package com.example.geeksforgeeks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GeeksforgeeksApplication {

    private static Logger logger = LoggerFactory.getLogger(GeeksforgeeksApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(GeeksforgeeksApplication.class, args);

        logger.info("This is info log");

    }

}
