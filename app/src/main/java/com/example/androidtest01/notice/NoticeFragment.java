package com.example.androidtest01.notice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.common.BlogItem;
import com.example.androidtest01.common.CommonMethod;

import java.util.ArrayList;


public class NoticeFragment extends Fragment {
    RecyclerView recv_notice;
    ArrayList<BlogDTO> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notice, container, false);

        list = BlogItem.getPostingItem(10);

        recv_notice = v.findViewById(R.id.recv_notice);
        CommentAdapter adapter = new CommentAdapter(inflater, getContext(), list);

        recv_notice.setAdapter(adapter);
        recv_notice.setLayoutManager(CommonMethod.getManagerVertical(getContext()));

        return v;
    }
}