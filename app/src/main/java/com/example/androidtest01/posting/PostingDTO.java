package com.example.androidtest01.posting;

import java.util.Date;

public class PostingDTO {
    private String name, title, content, comment, like, hits, neighbor;
    private int profile, photo;
    private Date date;

    public PostingDTO(String name, String title, String content, String comment, String like, String hits, String neighbor, int profile, int photo, Date date) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.comment = comment;
        this.like = like;
        this.hits = hits;
        this.neighbor = neighbor;
        this.profile = profile;
        this.photo = photo;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
