package com.example.androidtest01.common;

import com.example.androidtest01.blog.CommentDTO;
import com.example.androidtest01.newsfeed.ItemFeed;

import java.util.ArrayList;

public class CommentItem {

    public ArrayList<CommentDTO> getCommentItem() {
        ArrayList<CommentDTO> list = new ArrayList<>();
        ItemFeed item = new ItemFeed();

        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(1).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(2).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(3).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(4).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(5).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(6).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(7).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(8).getTitle()));
        list.add(new CommentDTO("마마", "정말 대단하시네요", "2022. 12. 20.", item.getPostingItem().get(9).getTitle()));


        return list;
    }
}
