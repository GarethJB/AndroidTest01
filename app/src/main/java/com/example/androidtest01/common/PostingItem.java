package com.example.androidtest01.common;

import com.example.androidtest01.R;
import com.example.androidtest01.posting.PostingDTO;

import java.util.ArrayList;

public class PostingItem {
        public static ArrayList<PostingDTO> getPostingItem(int itemNum) {
        ArrayList<PostingDTO> list = new ArrayList<>();
        int[] imgArr = {
                R.drawable.profile_img1,
                R.drawable.profile_img2,
                R.drawable.profile_img3,
                R.drawable.profile_img4,
                R.drawable.profile_img5,
                R.drawable.profile_img6,
                R.drawable.profile_img7,
                R.drawable.profile_img8
        };

           for (int i = 1; i < itemNum; i++) {
                list.add(new PostingDTO("닉네임"+i, "블로그제목"+i, "카테고리"+i, "제목"+i, "2022. 02. 01", "내용"+i, "댓글"+i, imgArr[0], imgArr[0], 1 , 5 , 6 ));
            }
           return list;
        }
}
