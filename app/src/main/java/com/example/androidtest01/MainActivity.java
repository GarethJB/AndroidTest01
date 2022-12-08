package com.example.androidtest01;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ImageView imgv_search, imgv_chatadd, imgv_openchat, imgv_setting;
    BottomNavigationView btm_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btm_nav = findViewById(R.id.btm_nav);
        //bottom navigation
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.btm_item1) {

                }else if(item.getItemId() == R.id.btm_item2) {

                }else if(item.getItemId() == R.id.btm_item3) {

                }else if(item.getItemId() == R.id.btm_item4) {

                }else if(item.getItemId() == R.id.btm_item5) {

                }
                return true;
            }
        });






    }
}