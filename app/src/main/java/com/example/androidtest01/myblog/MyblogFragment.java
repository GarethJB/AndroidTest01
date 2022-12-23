package com.example.androidtest01.myblog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.common.BlogItem;
import com.example.androidtest01.common.CommonMethod;

import java.util.ArrayList;


public class MyblogFragment extends Fragment {
    RecyclerView recv_myblog_photo, recv_myblog_list, recv_myblog_feed, recv_myblog_video;
    ArrayList<BlogDTO> list = new ArrayList<>();
    ImageView imgv_chanege_photo, imgv_chanege_list, imgv_chanege_feed, imgv_chanege_video;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_myblog, container, false);

        imgv_chanege_photo = v.findViewById(R.id.imgv_chanege_photo);
        imgv_chanege_list = v.findViewById(R.id.imgv_chanege_list);
        imgv_chanege_feed = v.findViewById(R.id.imgv_chanege_feed);
        imgv_chanege_video = v.findViewById(R.id.imgv_chanege_video);

        recv_myblog_photo = v.findViewById(R.id.recv_myblog_photo);
        recv_myblog_list = v.findViewById(R.id.recv_myblog_list);
        recv_myblog_feed = v.findViewById(R.id.recv_myblog_feed);
        recv_myblog_video = v.findViewById(R.id.recv_myblog_video);

        BlogItem item = new BlogItem();
        list = item.getMyblog();

        imgv_chanege_list.setImageResource(R.drawable.icon_list);



        PhotoAdapter adapter_photo = new PhotoAdapter(inflater, getContext(), list);
        recv_myblog_photo.setAdapter(adapter_photo);
        recv_myblog_photo.setLayoutManager(CommonMethod.getManagerVertical(getContext()));

        ListAdapter adapter_list = new ListAdapter(inflater, getContext(), list);
        recv_myblog_list.setAdapter(adapter_list);
        recv_myblog_list.setLayoutManager(CommonMethod.getManagerVertical(getContext()));

        FeedAdapter adapter_feed = new FeedAdapter(inflater, getContext(), list);
        recv_myblog_feed.setAdapter(adapter_feed);
        recv_myblog_feed.setLayoutManager(CommonMethod.getManagerVertical(getContext()));

        VideoAdapter adapter_video = new VideoAdapter(inflater);
        recv_myblog_video.setAdapter(adapter_video);
        recv_myblog_video.setLayoutManager(CommonMethod.getManagerVertical(getContext()));

        recv_myblog_photo.setVisibility(View.GONE);
        recv_myblog_list.setVisibility(View.VISIBLE);
        recv_myblog_feed.setVisibility(View.GONE);
        recv_myblog_video.setVisibility(View.GONE);

        imgv_chanege_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgv_chanege_photo.setImageResource(R.drawable.icon_photo);
                imgv_chanege_list.setImageResource(R.drawable.icon_list_fill);
                imgv_chanege_feed.setImageResource(R.drawable.icon_feed_fill);
                imgv_chanege_video.setImageResource(R.drawable.icon_video_fill);
                recv_myblog_photo.setVisibility(View.VISIBLE);
                recv_myblog_list.setVisibility(View.GONE);
                recv_myblog_feed.setVisibility(View.GONE);
                recv_myblog_video.setVisibility(View.GONE);
            }
        });

        imgv_chanege_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgv_chanege_photo.setImageResource(R.drawable.icon_photo_fill);
                imgv_chanege_list.setImageResource(R.drawable.icon_list);
                imgv_chanege_feed.setImageResource(R.drawable.icon_feed_fill);
                imgv_chanege_video.setImageResource(R.drawable.icon_video_fill);
                recv_myblog_photo.setVisibility(View.GONE);
                recv_myblog_list.setVisibility(View.VISIBLE);
                recv_myblog_feed.setVisibility(View.GONE);
                recv_myblog_video.setVisibility(View.GONE);
            }
        });

        imgv_chanege_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgv_chanege_photo.setImageResource(R.drawable.icon_photo_fill);
                imgv_chanege_list.setImageResource(R.drawable.icon_list_fill);
                imgv_chanege_feed.setImageResource(R.drawable.icon_feed);
                imgv_chanege_video.setImageResource(R.drawable.icon_video_fill);
                recv_myblog_photo.setVisibility(View.GONE);
                recv_myblog_list.setVisibility(View.GONE);
                recv_myblog_feed.setVisibility(View.VISIBLE);
                recv_myblog_video.setVisibility(View.GONE);
            }
        });

        imgv_chanege_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgv_chanege_photo.setImageResource(R.drawable.icon_photo_fill);
                imgv_chanege_list.setImageResource(R.drawable.icon_list_fill);
                imgv_chanege_feed.setImageResource(R.drawable.icon_feed_fill);
                imgv_chanege_video.setImageResource(R.drawable.icon_video);
                recv_myblog_photo.setVisibility(View.GONE);
                recv_myblog_list.setVisibility(View.GONE);
                recv_myblog_feed.setVisibility(View.GONE);
                recv_myblog_video.setVisibility(View.VISIBLE);
            }
        });

        return v;
    }

}