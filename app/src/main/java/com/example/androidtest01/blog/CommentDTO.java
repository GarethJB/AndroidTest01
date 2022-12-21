package com.example.androidtest01.blog;

import java.io.Serializable;

public class CommentDTO implements Serializable {
    String name, comment, date, title;

    public CommentDTO(String name, String comment, String date, String title) {
        this.name = name;
        this.comment = comment;
        this.date = date;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
