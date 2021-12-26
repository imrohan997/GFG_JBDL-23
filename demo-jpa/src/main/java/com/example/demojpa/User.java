package com.example.demojpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    int age;
    @Column(name = "senior_citizen")
    boolean isSeniorCitizen;
    @Column(unique = true)
    String email;

}
