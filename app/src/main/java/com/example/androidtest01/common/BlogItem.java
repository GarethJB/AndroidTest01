package com.example.androidtest01.common;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;

import java.util.ArrayList;

public class BlogItem {

        //뉴스피드 피드
        public ArrayList<BlogDTO> getNewsfeedFeed() {
        ArrayList<BlogDTO> list = new ArrayList<>();
        list.add( new BlogDTO(1,"츄리부인", "츄리 Blog", "일상", "오늘의 일기", "2022. 11. 9."
                , "오늘은 크리스마스에요 요즘 너무 바쁜 일상을 보내고 있지만 그래도 크리스마스 빠질 수 없죠!", R.drawable.newsfeedpro1, R.drawable.photo1
                , 1 , 3, 1));
        list.add(new BlogDTO(2, "북커크", "북커크 행성", "특별한 기억", "베트남에서의 기억", "2022. 7. 19."
                , "베트남의 여름은 푸른색으로 가득합니다. 이 곳은 자연과 인간이 조화롭게 살아가는 곳. 베트남입니다.", R.drawable.newsfeedpro2, R.drawable.photo2
                , 2 , 1, 1));
        list.add(new BlogDTO(3, "빙카하우스", "디저트 하우스 빙카", "리뷰", "강아지 다리 관리 - 관절 영양제", "2022. 12. 2."
                , "얼마전부터 저희집 장수가 뒷다리를 절뚝거리면서 걷는걸보고 얼마나 놀랬는지 몰라요.", R.drawable.newsfeedpro3, R.drawable.photo3
                , 2 , 13, 1));
        list.add( new BlogDTO(4, "김집순이", "김집순이의 일상", "맛있는거 먹자", "서울 파인다이닝 하비에르 후기", "2022. 12. 16."
                , "12월을 맞이해 남편과 분위기 좋은 미슐랭 맛집 서울 파인다이닝 하비에르 아란다를 다녀왔습니다.", R.drawable.newsfeedpro4, R.drawable.photo4
                , 1 , 2, 1));
        list.add( new BlogDTO(5, "산보", "EAT PRAY LOVE", "EAT", "초간단 발효 쌀피자 만들기", "3시간 전"
                , "요건 플레인 요거트를 넣어 만든 쌀피자 모습입니다. ", R.drawable.newsfeedpro5, R.drawable.photo5
                , 2 , 3, 1));
        list.add( new BlogDTO(6, "이랑", "이랑's HOUSE", "맛집탐방", "앤티크한 카페에서 공부 데이트", "2022. 11. 23."
                , "요즘 짝꿍과 함께 시험 하나를 준비 중인데 둘다 계속 미루다 최근에서야 공부 시작...", R.drawable.newsfeedpro6, R.drawable.photo6
                , 1 , 14, 1));
        list.add( new BlogDTO(7, "JSpark", "JS", "일상", "오늘의 일기", "2022. 11. 9."
                , "오늘은 크리스마스에요 요즘 너무 바쁜 일상을 보내고 있지만 그래도 크리스마스 빠질 수 없죠!", R.drawable.newsfeedpro7, R.drawable.photo1
                , 1 , 3, 1));

        return list;

        }
        //뉴스피드 모먼트
        public ArrayList<BlogDTO> getNewsfeedMoment() {
                ArrayList<BlogDTO> list = new ArrayList<>();

                list.add( new BlogDTO(1,"스타용", "용쓰블로그", "힐링", "테라리움", "2022. 3. 9."
                        , "화창한 푸른색의 식물을 보고나니 기분이 좋아요", R.drawable.newsfeedmopro1, R.drawable.moment1
                        , 1 , 3, 1));
                list.add(new BlogDTO(2, "미니마름모", "마름모세상", "소중한 일상", "크리스마스 트리", "2022. 7. 4."
                        , "트리를 보고 있으니 정말 크리스마스 분위기가 나요!", R.drawable.newsfeedmopro2, R.drawable.moment2
                        , 2 , 1, 1));
                list.add(new BlogDTO(3, "투썸플레이스", "둘만이 세상", "냥냥이", "우리 야옹이 자랑", "2022. 3. 2."
                        , "우리 야옹이 너무 귀엽죠?.", R.drawable.newsfeedmopro3, R.drawable.moment3
                        , 2 , 13, 1));
                list.add( new BlogDTO(4, "토피넛라떼", "일상의 행복", "일상", "크리스마스 화병", "2022. 4. 2."
                        , "크리스마스 화병입니다.", R.drawable.newsfeedmopro4, R.drawable.moment4
                        , 1 , 2, 1));
                list.add( new BlogDTO(5, "산악인 커트", "커트의 세상", "산행", "오랜만의 산악행", "2시간 전"
                        , "오랜만의 산악행입니다.", R.drawable.newsfeedmopro5, R.drawable.moment5
                        , 2 , 3, 1));
                list.add( new BlogDTO(6, "새박사", "버드월드", "새", "홍학두마리", "2022. 3. 23."
                        , "새 두마리가 포옹을 하고 있습니다.", R.drawable.newsfeedmopro6, R.drawable.moment6
                        , 1 , 14, 1));
                list.add( new BlogDTO(7, "츄츄", "츄츄로그", "일상", "11월의 일상", "2022. 11. 9."
                        , "초밥이 귀엽게 생겼네요? ㅎㅎ", R.drawable.newsfeedmopro7, R.drawable.moment7
                        , 1 , 3, 1));

                return list;

        }

        //추천 리스트 1, 2, 3
        public ArrayList<BlogDTO> getRecommendList1() {
                ArrayList<BlogDTO> list = new ArrayList<>();

                list.add( new BlogDTO(1,"준스월드", "준스 Blog", "일상", "피크닉", "2022. 5. 9."
                        , "여자친구와 피크닉을 왔습니다!", R.drawable.reclistpro1, R.drawable.list1_1
                        , 1 , 3, 1));
                list.add(new BlogDTO(2, "자허블", "자몽허니블랙티", "특별함", "크리스마스 트리 구매!", "2022. 12. 19."
                        , "크리스마스 트리를 구매했습니다.", R.drawable.reclistpro2, R.drawable.list1_2
                        , 2 , 1, 1));
                list.add(new BlogDTO(3, "해리케인", "토트넘 해리케인", "리뷰", "핫플 방문", "2022. 12. 2."
                        , "멋진 핫플입니다.", R.drawable.reclistpro3, R.drawable.list1_3
                        , 2 , 13, 1));


                return list;

        }
        public ArrayList<BlogDTO> getRecommendList2() {
                ArrayList<BlogDTO> list = new ArrayList<>();

                list.add( new BlogDTO(1,"에릭라멜라", "라멜라 Blog", "일상", "일기", "2022. 12. 9."
                        , "요즘 크리스마스 분위기가 물씬 풍깁니다.", R.drawable.reclistpro4, R.drawable.list2_1
                        , 1 , 3, 1));
                list.add(new BlogDTO(2, "라이언", "라이언 행성", "특별한 경험", "거리의 조명", "2022. 7. 19."
                        , "거리의 조명이 밝게 빛납니다..", R.drawable.reclistpro5, R.drawable.list2_2
                        , 2 , 1, 1));
                list.add(new BlogDTO(3, "빙고", "빙고월드", "리뷰", "꽃꽂이", "2022. 4. 2."
                        , "꽃꽂이를 해봤습니다.", R.drawable.reclistpro6, R.drawable.list2_3
                        , 2 , 13, 1));


                return list;

        }
        public ArrayList<BlogDTO> getRecommendList3() {
                ArrayList<BlogDTO> list = new ArrayList<>();

                list.add( new BlogDTO(1,"동동이", "동동 Blog", "일상", "크리스마스 쿠키", "2022. 12. 19."
                        , "맛있는 크리스마스 쿠키입니다", R.drawable.reclistpro7, R.drawable.list3_1
                        , 1 , 3, 1));
                list.add(new BlogDTO(2, "영국사람", "영국", "일상", "야경", "2022. 7. 19."
                        , "멋진 야경입니다.", R.drawable.reclistpro8, R.drawable.list3_2
                        , 2 , 1, 1));
                list.add(new BlogDTO(3, "밍키", "밍키블로그", "웨딩", "설레는 웨딩촬영", "2022. 12. 2."
                        , "우리 그이와 웨딩촬영을 했어요 너무 좋아용 야외촬영!.", R.drawable.reclistpro9, R.drawable.list3_3
                        , 2 , 13, 1));


                return list;

        }
        //추천 모먼트
        public ArrayList<BlogDTO> getRecommendMoment() {
                ArrayList<BlogDTO> list = new ArrayList<>();

                list.add( new BlogDTO(1,"추아메니", "츄추", "일상", "크리스마스 장식", "2022. 12. 9."
                        , "크리스마스 장식을 구매했습니다!", R.drawable.recmomentpro1, R.drawable.recmoment1
                        , 1 , 3, 1));
                list.add(new BlogDTO(2, "슈가슈가룬", "슈가의 디저트 세상", "디저트", "마카롱 도전!", "2022. 7. 19."
                        , "오늘은 마카롱에 도전해봤어요.", R.drawable.recmomentpro2, R.drawable.recmoment2
                        , 2 , 1, 1));
                list.add(new BlogDTO(3, "빌리", "빌리 하우스", "여행", "강릉 주문진 드라이브", "2022. 12. 2."
                        , "주문진의 바다는 언제 와도 좋아요.", R.drawable.recmomentpro3, R.drawable.recmoment3
                        , 2 , 13, 1));
                list.add(new BlogDTO(3, "포크", "포크월드", "여행", "광안대교", "2022. 12. 2."
                        , "광안대교를 가로지르는 느낌 쏘 굿.", R.drawable.recmomentpro4, R.drawable.recmoment4
                        , 2 , 13, 1));


                return list;

        }
        //추천 토픽
        public ArrayList<BlogDTO> getRecommendTopic() {
                ArrayList<BlogDTO> list = new ArrayList<>();

                list.add( new BlogDTO(1,"체어맨", "체어월드", "토픽", "눈에 쌓인 집", "2022. 12. 12."
                        , "대설로 인해 집이 갇혔습니다. 밖을 나갈수가 없어요.", R.drawable.recmomentpro5, R.drawable.rec_topic1
                        , 1 , 3, 1));
                list.add(new BlogDTO(2, "민지", "민지 blog", "일상", "눈내린 풍경", "2022. 12. 19."
                        , "저희 동네는 온통 하얀 세상입니다.", R.drawable.recmomentpro6, R.drawable.rec_topic2
                        , 2 , 1, 1));
                list.add(new BlogDTO(3, "산악인 엄홍길", "엄홍길의 Blog", "산행", "에베레스트산 등반", "2022. 12. 2."
                        , "에베레스트 산은 항상 눈에 덮여 있습니다.", R.drawable.recmomentpro7, R.drawable.rec_topic3
                        , 2 , 13, 1));
                list.add(new BlogDTO(3, "로스팅", "로스팅 하우스", "일상", "눈치우느라 고생", "2022. 12. 2."
                        , "눈이 왜 이렇게 많이 내리죠? 집에 갈 수 있을까요?", R.drawable.recmomentpro8, R.drawable.rec_topic4
                        , 2 , 13, 1));


                return list;

        }

        //마이블로그
        public ArrayList<BlogDTO> getMyblog() {
                ArrayList<BlogDTO> list = new ArrayList<>();

                list.add( new BlogDTO(1,"주빈", "JUBIN_Blog", "맛집탐방", "인도식 뷔페 인디", "2022. 12. 9."
                        , "인도 정통 커리의 풍미를 맛 보았습니다. 난도 고소해서 정말 맛있더라구요.", R.drawable.myblogpro, R.drawable.myblog1
                        , 1 , 3, 1));
                list.add(new BlogDTO(2, "주빈", "JUBIN_Blog", "맛집탐방", "너무 맛있는 피자", "2022. 11. 19."
                        , "치즈 늘어나는 것 좀 보세요. 너무 맛있겠죠?", R.drawable.myblogpro, R.drawable.myblog2
                        , 2 , 1, 1));
                list.add(new BlogDTO(3, "주빈", "JUBIN_Blog", "맛집탐방", "상무초밥", "2022. 8. 12."
                        , "오랜만에 상무초밥을 방문했습니다. 여전히 맛있더군요.", R.drawable.myblogpro, R.drawable.myblog3
                        , 2 , 13, 1));
                list.add(new BlogDTO(3, "주빈", "JUBIN_Blog", "맛집탐방", "수제버거 맛집", "2022. 7. 1."
                        , "이태원의 수제버거 맛집입니다.", R.drawable.myblogpro, R.drawable.myblog4
                        , 2 , 13, 1));
                list.add(new BlogDTO(3, "주빈", "JUBIN_Blog", "맛집탐방", "이팅룸", "2022. 5. 6."
                        , "웨이팅을 1시간이나 하고 들어간 이팅룸. 기다린 시간이 아깝지 않았어요.", R.drawable.myblogpro, R.drawable.myblog5
                        , 2 , 13, 1));
                list.add(new BlogDTO(3, "주빈", "JUBIN_Blog", "맛집탐방", "이색버거맛집", "2022. 2. 2."
                        , "생김새가 특이한 버거인데요 맛은 괜찮았습니다.", R.drawable.myblogpro, R.drawable.myblog6
                        , 2 , 13, 1));


                return list;

        }


}
