package com.example.androidtest01.newsfeed;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidtest01.R;
import com.example.androidtest01.common.CommonMethod;
import com.example.androidtest01.common.BlogItem;
import com.example.androidtest01.blog.BlogDTO;

import java.util.ArrayList;


public class NewsfeedFragment extends Fragment {
    RecyclerView recv_newsfeed_moment, recv_newsfeed_feed;
    ArrayList<BlogDTO> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_newsfeed, container, false);

        recv_newsfeed_moment = v.findViewById(R.id.recv_newsfeed_moment);
        recv_newsfeed_feed = v.findViewById(R.id.recv_newsfeed_feed);

        list = BlogItem.getPostingItem(20);

        MomentAdapter adapter_moment = new MomentAdapter(inflater, getContext(), list);
        FeedAdapter adapter_feed = new FeedAdapter(inflater, getContext(), list);

        recv_newsfeed_moment.setAdapter(adapter_moment);
        recv_newsfeed_moment.setLayoutManager(CommonMethod.getManagerHorizontal(getContext()));

        recv_newsfeed_feed.setAdapter(adapter_feed);
        recv_newsfeed_feed.setLayoutManager(CommonMethod.getManagerVertical(getContext()));

        return v;
    }
}