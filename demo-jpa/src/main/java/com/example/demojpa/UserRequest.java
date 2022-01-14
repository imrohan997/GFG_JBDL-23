package com.example.demojpa;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {


    @NotBlank
    String firstName;
    @NotBlank
    String lastName;

    Integer age;
    @Email
    @NotNull
    String email;


    private Boolean isSeniorCitizen() {
        return this.age >= 60;
    }

    public User toUser() {
        return User.builder()
                .age(age)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .seniorCitizen(age == null ? null : isSeniorCitizen())
                .build();
    }


}
