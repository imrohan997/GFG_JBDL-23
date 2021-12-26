package com.example.demojpa;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {


    @NotNull
    @Size(max = 20)
    String firstName;
    @NotNull
    @Size(max = 20)
    String lastName;
    @Min(value = 1)
    @Max(value = 100)
    int age;
    @Email
    @NotNull
    String email;


    private boolean isSeniorCitizen() {
        return this.age >= 60;
    }

    public User toUser() {
        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .email(email)
                .isSeniorCitizen(age == 0 ? false : isSeniorCitizen())
                .build();
        return user;
    }
}
