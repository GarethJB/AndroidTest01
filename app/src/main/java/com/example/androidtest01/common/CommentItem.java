package com.example.androidtest01.common;

import com.example.androidtest01.blog.CommentDTO;

import java.util.ArrayList;

public class CommentItem {

    public ArrayList<CommentDTO> getCommentItem() {
        ArrayList<CommentDTO> list = new ArrayList<>();
        BlogItem item = new BlogItem();

        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getMyblog().get(0).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getMyblog().get(1).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getMyblog().get(2).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getMyblog().get(3).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getMyblog().get(4).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getMyblog().get(5).getTitle()));


        return list;
    }
}
