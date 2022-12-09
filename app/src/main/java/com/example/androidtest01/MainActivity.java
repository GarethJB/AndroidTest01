package com.example.androidtest01;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.androidtest01.myblog.MyblogFragment;
import com.example.androidtest01.newsfeed.NewsfeedFragment;
import com.example.androidtest01.notice.NoticeFragment;
import com.example.androidtest01.recommend.RecommendFragment;
import com.example.androidtest01.writing.WritingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btm_nav;
    TextView tv_top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_top = findViewById(R.id.tv_top);
        btm_nav = findViewById(R.id.btm_nav);

        //bottom navigation
        changeFragment(new NewsfeedFragment());
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.btm_item1) {
                    tv_top.setText("이웃새글");
                    changeFragment(new NewsfeedFragment());
                }else if(item.getItemId() == R.id.btm_item2) {
                    tv_top.setText("추천");
                    changeFragment(new RecommendFragment());
                }else if(item.getItemId() == R.id.btm_item3) {
                    tv_top.setText("");
                    changeFragment(new WritingFragment());
                }else if(item.getItemId() == R.id.btm_item4) {
                    tv_top.setText("내소식");
                    changeFragment(new NoticeFragment());
                }else if(item.getItemId() == R.id.btm_item5) {
                    tv_top.setText("");
                    changeFragment(new MyblogFragment());
                }
                return true;
            }
        });

    }

    public void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}