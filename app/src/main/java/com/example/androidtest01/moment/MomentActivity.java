package com.example.androidtest01.moment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtest01.R;
import com.example.androidtest01.posting.PostingActivity;
import com.example.androidtest01.blog.BlogDTO;

public class MomentActivity extends AppCompatActivity {
    ImageView imgv_photo, imgv_profile, imgv_moment_back;
    TextView tv_name, tv_date, tv_contents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moment);

        imgv_photo = findViewById(R.id.imgv_photo);
        imgv_profile = findViewById(R.id.imgv_profile);
        imgv_moment_back = findViewById(R.id.imgv_moment_back);
        tv_name = findViewById(R.id.tv_name);
        tv_date = findViewById(R.id.tv_date);
        tv_contents = findViewById(R.id.tv_contents);

        imgv_moment_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        BlogDTO dto = (BlogDTO) intent.getSerializableExtra("dto");

        imgv_photo.setImageResource(dto.getPhoto());
        imgv_profile.setImageResource(dto.getProfile());
        tv_name.setText(dto.getName());
        tv_date.setText(dto.getDate());
        tv_contents.setText(dto.getContents());

        imgv_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MomentActivity.this, PostingActivity.class);
                intent.putExtra("dto", dto);
                startActivity(intent);
            }
        });

    }
}