package com.example.androidtest01.posting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.comment.CommentActivity;

public class PostingActivity extends AppCompatActivity {
    LinearLayout line_go_comment;
    TextView tv_blogname, tv_likes, tv_comments, tv_category, tv_title, tv_name, tv_posting_date, tv_neighbor, tv_contents ;
    ImageView imgv_back, imgv_profile, imgv_photo, imgv_like;
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);

        line_go_comment = findViewById(R.id.line_go_comment);
        imgv_back = findViewById(R.id.imgv_back);
        imgv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        tv_blogname = findViewById(R.id.tv_blogname);
        tv_likes = findViewById(R.id.tv_likes);
        tv_comments = findViewById(R.id.tv_comments);
        tv_category = findViewById(R.id.tv_category);
        tv_title = findViewById(R.id.tv_title);
        tv_name = findViewById(R.id.tv_name);
        tv_posting_date = findViewById(R.id.tv_posting_date);
        tv_neighbor = findViewById(R.id.tv_neighbor);
        tv_contents = findViewById(R.id.tv_contents);
        imgv_profile = findViewById(R.id.imgv_profile);
        imgv_photo = findViewById(R.id.imgv_photo);
        imgv_like = findViewById(R.id.imgv_like);

        Intent intent = getIntent();
        BlogDTO dto = (BlogDTO) intent.getSerializableExtra("dto");

        tv_blogname.setText(dto.getBlogname());
        tv_likes.setText(dto.getLikes()+"");
        tv_comments.setText(dto.getComments()+"");
        tv_category.setText(dto.getCategory());
        tv_title.setText(dto.getTitle());
        tv_name.setText(dto.getName());
        tv_posting_date.setText(dto.getDate());
        tv_neighbor.setText(dto.getNeighbor()+"");
        tv_contents.setText(dto.getContents());
        imgv_profile.setImageResource(dto.getProfile());
        imgv_photo.setImageResource(dto.getPhoto());

        line_go_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostingActivity.this, CommentActivity.class);
                intent.putExtra("dto", dto);// 오류 발생 원인 : ?
                startActivity(intent);
            }
        });

        imgv_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                if (cnt % 2 == 1) {
                    imgv_like.setImageResource(R.drawable.icon_like2);
                    tv_likes.setText((dto.getLikes()+1)+"");
                }else if(cnt % 2 != 1) {
                    imgv_like.setImageResource(R.drawable.icon_like);
                    tv_likes.setText((dto.getLikes()-1)+"");
                }
            }
        });

    }

}