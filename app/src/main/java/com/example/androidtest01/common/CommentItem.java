package com.example.androidtest01.common;

import com.example.androidtest01.blog.CommentDTO;

import java.util.ArrayList;

public class CommentItem {

    public ArrayList<CommentDTO> getCommentItem() {
        ArrayList<CommentDTO> list = new ArrayList<>();
        BlogItem item = new BlogItem();

        list.add(new CommentDTO("다닝", "우와 정말 멋진데요!", "2022. 12. 9.", item.getMyblog().get(0).getTitle()));
        list.add(new CommentDTO("짜루", "와 짱이당..", "2022. 11. 19.", item.getMyblog().get(1).getTitle()));
        list.add(new CommentDTO("우표친구", "사진을 정말 잘 찍으셨네요!", "2022. 8. 12.", item.getMyblog().get(2).getTitle()));
        list.add(new CommentDTO("박찹쌀", "와 사진만 봐도 행복해요", "2022. 7. 1.", item.getMyblog().get(3).getTitle()));
        list.add(new CommentDTO("우라이더", "크.. 비쥬얼 짱입니다ㅎㅎ", "2022. 5. 6.", item.getMyblog().get(4).getTitle()));
        list.add(new CommentDTO("홀인원", "이쁘네요 ㅋㅋㅋ", "2022. 2. 2.", item.getMyblog().get(5).getTitle()));
        list.add(new CommentDTO("홀인원", "멋져요!", "2022. 2. 2.", item.getMyblog().get(5).getTitle()));
        list.add(new CommentDTO("홀인원", "퍼가도 될까요?", "2022. 2. 2.", item.getMyblog().get(5).getTitle()));


        return list;
    }
}
