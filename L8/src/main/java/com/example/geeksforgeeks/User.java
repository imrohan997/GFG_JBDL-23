package com.example.geeksforgeeks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Getter
@Service
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    int age;
    String name;
    int id;
}
