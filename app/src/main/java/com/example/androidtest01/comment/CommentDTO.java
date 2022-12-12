package com.example.androidtest01.comment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommentDTO {
    private String name, title, content;
    private Date date;

    public CommentDTO(String name, String title, String content, Date date) {
        this.name = name;
        this.title = title;
        this.content = content;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        long now = System.currentTimeMillis();
        this.date = new Date(now);
        //SimpleDateFormat fmt = new SimpleDateFormat("yyyy. MM. dd.");
        //String nowDate = fmt.format(date);
    }
}
