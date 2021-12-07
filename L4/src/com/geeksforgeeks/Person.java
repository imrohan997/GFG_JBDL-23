package com.geeksforgeeks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private int weight;

    public static void main(String[] args) {
        Person person = new Person("Rohan", 24, 77);

    }
}
