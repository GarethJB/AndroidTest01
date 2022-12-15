package com.example.androidtest01.writing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidtest01.R;

public class WritingActivity extends AppCompatActivity {
    TextView tv_writing_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);

        tv_writing_back = findViewById(R.id.tv_writing_back);

        tv_writing_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}