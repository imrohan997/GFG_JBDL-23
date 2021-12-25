package com.example.geeksforgeeks;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {


    @NotBlank
    @Size(max = 20)
    private String firstName;
    @NotBlank
    private String lastName;

    @Min(value = 1)
    @Max(value = 100)
    private int age;
    @Email
    private String email;

    private boolean checkIfSeniorCitizen() {
        return this.age >= 60;
    }

    public User toUser() {
        return User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .email(email)
                .isSeniorCitizen(checkIfSeniorCitizen())
                .build();

    }
}
