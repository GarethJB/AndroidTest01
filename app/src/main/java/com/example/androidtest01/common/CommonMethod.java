package com.example.androidtest01.common;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;

import java.util.Set;

public class CommonMethod {

    public static LinearLayoutManager getManagerVertical(Context context) {
        LinearLayoutManager manager = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
        return manager;
    }

    public static LinearLayoutManager getManagerHorizontal(Context context) {
        LinearLayoutManager manager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        return manager;
    }
}
