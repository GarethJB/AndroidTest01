package com.example.androidtest01.myblog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidtest01.R;
import com.google.android.material.tabs.TabLayout;


public class MyblogFragment extends Fragment {
    TabLayout tabl_myblog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_myblog, container, false);
        tabl_myblog = v.findViewById(R.id.tabl_myblog);

        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(1));
        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(2));
        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(3));
        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(4));


        return v;
    }
}