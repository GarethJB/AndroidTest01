package com.example.androidtest01.common;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;

import java.util.ArrayList;

public class BlogItem {
        public ArrayList<BlogDTO> getPostingItem() {
        ArrayList<BlogDTO> list = new ArrayList<>();

        list.add( new BlogDTO(1,"츄리부인", "츄리 Blog", "일상", "오늘의 일기", "2022. 11. 9."
                , "오늘은 크리스마스에요 요즘 너무 바쁜 일상을 보내고 있지만 그래도 크리스마스 빠질 수 없죠!", R.drawable.profile_img1, R.drawable.photo1
                , 1 , 3, 1));
        list.add(new BlogDTO(2, "북커크", "북커크 행성", "특별한 기억", "베트남에서의 기억", "2022. 7. 19."
                , "베트남의 여름은 푸른색으로 가득합니다. 이 곳은 자연과 인간이 조화롭게 살아가는 곳. 베트남입니다.", R.drawable.profile_img2, R.drawable.photo2
                , 2 , 1, 1));
        list.add(new BlogDTO(3, "빙카하우스", "디저트 하우스 빙카", "리뷰", "강아지 다리 관리 - 관절 영양제", "2022. 12. 2."
                , "얼마전부터 저희집 장수가 뒷다리를 절뚝거리면서 걷는걸보고 얼마나 놀랬는지 몰라요.", R.drawable.profile_img3, R.drawable.photo3
                , 2 , 13, 1));
        list.add( new BlogDTO(4, "김집순이", "김집순이의 일상", "맛있는거 먹자", "서울 파인다이닝 하비에르 후기", "2022. 12. 16."
                , "12월을 맞이해 남편과 분위기 좋은 미슐랭 맛집 서울 파인다이닝 하비에르 아란다를 다녀왔습니다.", R.drawable.profile_img4, R.drawable.photo4
                , 1 , 2, 1));
        list.add( new BlogDTO(5, "산보", "EAT PRAY LOVE", "EAT", "초간단 발효 쌀피자 만들기", "3시간 전"
                , "요건 플레인 요거트를 넣어 만든 쌀피자 모습입니다. 밥 한공기 찹쌀가루 한 컵 고구마 전분 한컵에 요거트를 물대신 뭉쳐질 때 까지 조금씩 넣어 섞어 뭉쳐주었어요", R.drawable.profile_img5, R.drawable.photo5
                , 2 , 3, 1));
        list.add( new BlogDTO(6, "이랑", "이랑's HOUSE", "맛집탐방", "앤티크한 카페에서 공부 데이트", "2022. 11. 23."
                , "요즘 짝꿍과 함께 시험 하나를 준비 중인데 둘다 계속 미루다 최근에서야 공부 시작... 그래서 퇴근 후 신논현역에서 저녁을 먹고 조용한 카페에서 공부 데이트를 했어요!", R.drawable.profile_img6, R.drawable.photo6
                , 1 , 14, 1));
        list.add( new BlogDTO(7, "츄리부인", "츄리 Blog", "일상", "오늘의 일기", "2022. 11. 9."
                , "오늘은 크리스마스에요 요즘 너무 바쁜 일상을 보내고 있지만 그래도 크리스마스 빠질 수 없죠!", R.drawable.profile_img1, R.drawable.photo1
                , 1 , 3, 1));
        list.add( new BlogDTO(8, "츄리부인", "츄리 Blog", "일상", "오늘의 일기", "2022. 11. 9."
                , "오늘은 크리스마스에요 요즘 너무 바쁜 일상을 보내고 있지만 그래도 크리스마스 빠질 수 없죠!", R.drawable.profile_img1, R.drawable.photo1
                , 1 , 3, 1));
        list.add( new BlogDTO(9, "츄리부인", "츄리 Blog", "일상", "오늘의 일기", "2022. 11. 9."
                , "오늘은 크리스마스에요 요즘 너무 바쁜 일상을 보내고 있지만 그래도 크리스마스 빠질 수 없죠!", R.drawable.profile_img1, R.drawable.photo1
                , 1 , 3, 1));
        list.add( new BlogDTO(10, "츄리부인", "츄리 Blog", "일상", "오늘의 일기", "2022. 11. 9."
                , "오늘은 크리스마스에요 요즘 너무 바쁜 일상을 보내고 있지만 그래도 크리스마스 빠질 수 없죠!", R.drawable.profile_img1, R.drawable.photo1
                , 1 , 3, 1));

        return list;

        }
}
