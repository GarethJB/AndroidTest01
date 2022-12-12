package com.example.androidtest01.moment;

import java.util.Date;

public class MomentDTO {
    private String name, title, content, comment, like, play_cnt;
    private int profile, video;
    private Date date;

    public MomentDTO(String name, String title, String content, String comment, String like, String play_cnt, int profile, int video, Date date) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.comment = comment;
        this.like = like;
        this.play_cnt = play_cnt;
        this.profile = profile;
        this.video = video;
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

    public String getPlay_cnt() {
        return play_cnt;
    }

    public void setPlay_cnt(String play_cnt) {
        this.play_cnt = play_cnt;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
