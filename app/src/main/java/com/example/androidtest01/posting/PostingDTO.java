package com.example.androidtest01.posting;

import java.io.Serializable;
import java.util.Date;

public class PostingDTO implements Serializable {
    private String name, blogname, category, title, date, contents, comment;
    private int profile, photo, neighbor, likes, comments;

    public PostingDTO(String name, String blogname, String category, String title, String date, String contents, String comment, int profile, int photo, int neighbor, int likes, int comments) {
        this.name = name;
        this.blogname = blogname;
        this.category = category;
        this.title = title;
        this.date = date;
        this.contents = contents;
        this.comment = comment;
        this.profile = profile;
        this.photo = photo;
        this.neighbor = neighbor;
        this.likes = likes;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(int neighbor) {
        this.neighbor = neighbor;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}
