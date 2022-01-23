package com.example.demoredis.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable{
    Integer id;
    String name;
    String phoneNumber;
    Integer age;
}
