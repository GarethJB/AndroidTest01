package com.example.androidtest01.comment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.common.CommentItem;
import com.example.androidtest01.posting.PostingActivity;

public class CommentActivity extends AppCompatActivity {
    ImageView imgv_back;
    TextView tv_go_posting, tv_name, tv_comment, tv_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        CommentItem item = new CommentItem();

        imgv_back = findViewById(R.id.imgv_back);
        tv_go_posting = findViewById(R.id.tv_go_posting);
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

        tv_name.setText(item.getCommentItem().get(dto.getId()).getName());
        tv_date.setText(item.getCommentItem().get(dto.getId()).getDate());
        tv_comment.setText(item.getCommentItem().get(dto.getId()).getComment());

        tv_go_posting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommentActivity.this, PostingActivity.class);
                intent.putExtra("dto", dto);
                startActivity(intent);
            }
        });




    }
}