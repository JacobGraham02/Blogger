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

    public void setUsername(final String username) {
        this.username = username;
    }
    public final String getUsername() {
        return this.username;
    }

    public final void setPassword(final String password) {
        this.password = password;
    }

    public final String getPassword() {
        return this.password;
    }


}
