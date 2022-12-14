package com.example.androidtest01.myblog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.common.CommonMethod;
import com.example.androidtest01.common.PostingItem;
import com.example.androidtest01.posting.PostingDTO;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class MyblogFragment extends Fragment {
    TabLayout tabl_myblog;
    RecyclerView recv_myblog_photo, recv_myblog_list, recv_myblog_feed, recv_myblog_video;
    ArrayList<PostingDTO> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_myblog, container, false);
        tabl_myblog = v.findViewById(R.id.tabl_myblog);
        recv_myblog_photo = v.findViewById(R.id.recv_myblog_photo);
        recv_myblog_list = v.findViewById(R.id.recv_myblog_list);
        recv_myblog_feed = v.findViewById(R.id.recv_myblog_feed);
        recv_myblog_video = v.findViewById(R.id.recv_myblog_video);

        list = PostingItem.getPostingItem(10);



        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(1));
        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(2));
        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(3));
        tabl_myblog.addTab(tabl_myblog.newTab().setIcon(R.drawable.icon_search).setId(4));



        tabl_myblog.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getId() == 1) {
                    recv_myblog_photo.setVisibility(View.VISIBLE);
                    recv_myblog_list.setVisibility(View.GONE);
                    recv_myblog_feed.setVisibility(View.GONE);
                    recv_myblog_video.setVisibility(View.GONE);
                    PhotoAdapter adapter = new PhotoAdapter(inflater, getContext(), list);
                    recv_myblog_photo.setAdapter(adapter);
                    recv_myblog_photo.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
                }else if(tab.getId() == 2) {
                    recv_myblog_photo.setVisibility(View.GONE);
                    recv_myblog_list.setVisibility(View.VISIBLE);
                    recv_myblog_feed.setVisibility(View.GONE);
                    recv_myblog_video.setVisibility(View.GONE);
                    ListAdapter adapter = new ListAdapter(inflater, getContext(), list);
                    recv_myblog_list.setAdapter(adapter);
                    recv_myblog_list.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
                }else if(tab.getId() == 3) {
                    recv_myblog_photo.setVisibility(View.GONE);
                    recv_myblog_list.setVisibility(View.GONE);
                    recv_myblog_feed.setVisibility(View.VISIBLE);
                    recv_myblog_video.setVisibility(View.GONE);
                    FeedAdapter adapter = new FeedAdapter(inflater, getContext(), list);
                    recv_myblog_feed.setAdapter(adapter);
                    recv_myblog_feed.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
                }else if(tab.getId() == 4) {
                    recv_myblog_photo.setVisibility(View.GONE);
                    recv_myblog_list.setVisibility(View.GONE);
                    recv_myblog_feed.setVisibility(View.GONE);
                    recv_myblog_video.setVisibility(View.VISIBLE);
                    VideoAdapter adapter = new VideoAdapter(inflater);
                    recv_myblog_video.setAdapter(adapter);
                    recv_myblog_video.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });


        return v;
    }
}