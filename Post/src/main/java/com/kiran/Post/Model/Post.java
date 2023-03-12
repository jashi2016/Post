package com.kiran.Post.Model;


import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post{
    @Id
    Integer id;
    String title;
    String description;

    public Post() {
    }

    public Post(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
