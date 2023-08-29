package com.jacobdgraham.ats.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="user_blog")
public class UserBlog {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(length=255,nullable=false)
    @NotEmpty(message="Your article title cannot be empty")
    @Size(min=4,max=255,message="Your article title must be between 0 and 255 characters")
    private String title;

    @Column(unique=true,length=255,nullable=false)
    @NotEmpty(message="This article uri cannot be empty")
    @Size(min=50,max=255,message="This article uri must be between 50 and 255 characters")
    private String uri;

    @Column(unique=true,nullable=false)
    @NotEmpty(message="The brief description of this article cannot be empty")
    @Lob
    private String short_description;

    @Column(unique=true,nullable=false)
    @NotEmpty(message="The content of this article cannot be empty")
    @Lob
    private String content;

    @Column(name="created",nullable=false,updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column(name="updated",nullable=false,updatable=true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @ManyToOne
    @JoinColumn(name="id",referencedColumnName="id")
    private User user;

    protected UserBlog() {

    }

    public UserBlog(String title, String uri) {
        validateTitle(title);
        validateUri(uri);
        this.title = title;
        this.uri = uri;
    }

    private void validateTitle(final String article_title) {

    }

    private void validateUri(final String article_uri) {

    }

}
