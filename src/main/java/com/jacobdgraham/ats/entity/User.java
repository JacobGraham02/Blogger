package com.jacobdgraham.ats.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(unique=true,length=50,nullable=false)
    @NotBlank(message="Your username must not be blank")
    @Size(min=4,max=32,message="Your username must be between 4 and 32 characters")
    private String username;

    @Column(length=255, nullable=false)
    @NotBlank(message="Your password must not be blank")
    @Size(min=4,max=32,message="Your password must be between 4 and 32 characters")
    private String password;

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<UserBlog> user_blog_list;

    protected User() {

    }

    protected User(String username, String password) {

    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return this.id;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUserBlogList(final List<UserBlog> user_blog_list) {
        this.user_blog_list = user_blog_list;
    }

}
