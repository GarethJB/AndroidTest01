package com.example.androidtest01;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imgv_search, imgv_chatadd, imgv_openchat, imgv_setting;
    TextView tv_top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_top = findViewById(R.id.tv_top);
        imgv_search = findViewById(R.id.imgv_search);
        imgv_chatadd = findViewById(R.id.imgv_chatadd);
        imgv_openchat = findViewById(R.id.imgv_openchat);
        imgv_setting = findViewById(R.id.imgv_setting);

        tv_top.setText("친구");


    }
}