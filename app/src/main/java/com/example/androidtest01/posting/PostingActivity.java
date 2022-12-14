package com.example.androidtest01.posting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtest01.R;
import com.example.androidtest01.posting.PostingFragment;

public class PostingActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv_posting_blogname, tv_posting_likes, tv_posting_comments, tv_posting_category, tv_posting_title, tv_posting_name, tv_posting_date, tv_posting_neighbor, tv_posting_contents ;
    ImageView imgv_posting_back, imgv_posting_profile, imgv_posting_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);

        imgv_posting_back = findViewById(R.id.imgv_posting_back);
        imgv_posting_back.setOnClickListener(this);

        tv_posting_blogname = findViewById(R.id.tv_posting_blogname);
        tv_posting_likes = findViewById(R.id.tv_posting_likes);
        tv_posting_comments = findViewById(R.id.tv_posting_comments);
        tv_posting_category = findViewById(R.id.tv_posting_category);
        tv_posting_title = findViewById(R.id.tv_posting_title);
        tv_posting_name = findViewById(R.id.tv_posting_name);
        tv_posting_date = findViewById(R.id.tv_posting_date);
        tv_posting_neighbor = findViewById(R.id.tv_posting_neighbor);
        tv_posting_contents = findViewById(R.id.tv_posting_contents);
        imgv_posting_profile = findViewById(R.id.imgv_posting_profile);
        imgv_posting_photo = findViewById(R.id.imgv_posting_photo);

        Intent intent = getIntent();
        PostingDTO dto = (PostingDTO) intent.getSerializableExtra("dto");

        tv_posting_blogname.setText(dto.getBlogname());
        tv_posting_likes.setText(dto.getLikes()+"");
        tv_posting_comments.setText(dto.getComments()+"");
        tv_posting_category.setText(dto.getCategory());
        tv_posting_title.setText(dto.getTitle());
        tv_posting_name.setText(dto.getName());
        tv_posting_date.setText(dto.getDate());
        tv_posting_neighbor.setText(dto.getNeighbor()+"");
        tv_posting_contents.setText(dto.getContents());
        imgv_posting_profile.setImageResource(dto.getProfile());
        imgv_posting_photo.setImageResource(dto.getPhoto());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgv_posting_back) {
            onBackPressed();
        }
    }
}