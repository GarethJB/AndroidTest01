package com.example.androidtest01.comment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.common.BlogItem;
import com.example.androidtest01.moment.MomentActivity;
import com.example.androidtest01.posting.PostingActivity;

import java.util.ArrayList;

public class CommentActivity extends AppCompatActivity {
    ArrayList<BlogDTO> list = new ArrayList<>();
    ImageView imgv_profile, imgv_back;
    TextView tv_go_posting, tv_name, tv_comment, tv_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        imgv_back = findViewById(R.id.imgv_back);
        tv_go_posting = findViewById(R.id.tv_go_posting);
        imgv_profile = findViewById(R.id.imgv_profile);
        tv_name = findViewById(R.id.tv_name);
        tv_comment = findViewById(R.id.tv_comment);
        tv_date = findViewById(R.id.tv_date);

        imgv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        BlogDTO dto = (BlogDTO) intent.getSerializableExtra("dto");

        imgv_profile.setImageResource(dto.getProfile());
        tv_name.setText(dto.getName());
        tv_comment.setText(dto.getComment());
        tv_date.setText(dto.getDate());

        tv_go_posting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommentActivity.this, PostingActivity.class);
                intent.putExtra("dto", dto);// 오류 발생 원인 : ?
                startActivity(intent);
            }
        });




    }
}