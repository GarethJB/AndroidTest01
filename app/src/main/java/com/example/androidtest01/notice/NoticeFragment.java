package com.example.androidtest01.notice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.blog.CommentDTO;
import com.example.androidtest01.common.BlogItem;
import com.example.androidtest01.common.CommentItem;
import com.example.androidtest01.common.CommonMethod;

import java.util.ArrayList;


public class NoticeFragment extends Fragment {
    RecyclerView recv_notice;
    ArrayList<CommentDTO> c_list = new ArrayList<>();
    ArrayList<BlogDTO> b_list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notice, container, false);

        CommentItem c_item = new CommentItem();
        BlogItem b_item = new BlogItem();

        c_list = c_item.getCommentItem();
        b_list = b_item.getPostingItem();

        recv_notice = v.findViewById(R.id.recv_notice);
        CommentAdapter adapter = new CommentAdapter(inflater, getContext(), c_list, b_list);

        recv_notice.setAdapter(adapter);
        recv_notice.setLayoutManager(CommonMethod.getManagerVertical(getContext()));

        return v;
    }
}