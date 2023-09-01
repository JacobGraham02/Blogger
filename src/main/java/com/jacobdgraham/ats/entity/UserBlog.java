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

    @Column(name="title",length=255,nullable=false)
    @NotEmpty(message="Your article title cannot be empty")
    @Size(min=4,max=255,message="Your article title must be between 0 and 255 characters")
    private String title;

    @Column(name="url",unique=true,length=255,nullable=false)
    @NotEmpty(message="This article uri cannot be empty")
    @Size(min=50,max=255,message="This article uri must be between 50 and 255 characters")
    private String uri;

    @Column(name="short_description",unique=true,nullable=false)
    @NotEmpty(message="The brief description of this article cannot be empty")
    @Lob
    private String short_description;

    @Column(name="content",unique=true,nullable=false)
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
    @JoinColumn(name="user_id",referencedColumnName="id")
    private User user;

    protected UserBlog() {

    }

    public UserBlog(final String title, final String uri, final String short_description, final String content, final Date created, final Date updated) {
        setTitle(title);
        setUri(uri);
        setShortDescription(short_description);
        setContent(content);
        setCreated(created);
        setUpdated(updated);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getShortDescription() {
        return short_description;
    }

    public void setShortDescription(String short_description) {
        this.short_description = short_description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
