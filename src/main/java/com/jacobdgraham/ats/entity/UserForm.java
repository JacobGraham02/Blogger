package com.jacobdgraham.ats.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserForm {

    @NotEmpty(message="The username field cannot be empty")
    @Size(min=4,max=32,message="The username field data must be between 4 and 32 characters in length")
    private String username;

    @NotEmpty(message="The password field cannot be empty")
    @Size(min=4,max=32,message="The password field data must be between 4 and 32 characters in length")
    private String password;


}
