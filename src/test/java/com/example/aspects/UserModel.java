package com.example.aspects;

import lombok.Data;

@Data
public class UserModel {

    private String firstName;
    private String lastName;
    private String fullName;

    public UserModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
