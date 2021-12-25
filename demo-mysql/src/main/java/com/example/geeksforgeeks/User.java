package com.example.geeksforgeeks;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String firstName;
    private String lastName;
    private int id;
    private int age;
    private boolean isSeniorCitizen;
    private String email;


}
