package com.example.androidtest01.common;

import com.example.androidtest01.blog.CommentDTO;

import java.util.ArrayList;

public class CommentItem {

    public ArrayList<CommentDTO> getCommentItem() {
        ArrayList<CommentDTO> list = new ArrayList<>();
        BlogItem item = new BlogItem();

        list.add(new CommentDTO("다닝", "커리가 너무 맛있어 보여요!", "2022. 12. 9.", item.getMyblog().get(0).getTitle()));
        list.add(new CommentDTO("짜루", "우와 치즈 늘어나는거 짱이당..", "2022. 11. 19.", item.getMyblog().get(1).getTitle()));
        list.add(new CommentDTO("우표친구", "초밥 저도 너무 좋아해요!", "2022. 8. 12.", item.getMyblog().get(2).getTitle()));
        list.add(new CommentDTO("박찹쌀", "햄버거가 정말 큼지막하네요", "2022. 7. 1.", item.getMyblog().get(3).getTitle()));
        list.add(new CommentDTO("우라이더", "크.. 비쥬얼 짱입니다ㅎㅎ", "2022. 5. 6.", item.getMyblog().get(4).getTitle()));
        list.add(new CommentDTO("홀인원", "정말 먹음직스럽네요ㅋㅋㅋㅋ", "2022. 2. 2.", item.getMyblog().get(5).getTitle()));
        list.add(new CommentDTO("홀인원", "정말 먹음직스럽네요ㅋㅋㅋㅋ", "2022. 2. 2.", item.getMyblog().get(5).getTitle()));
        list.add(new CommentDTO("홀인원", "정말 먹음직스럽네요ㅋㅋㅋㅋ", "2022. 2. 2.", item.getMyblog().get(5).getTitle()));


        return list;
    }
}
