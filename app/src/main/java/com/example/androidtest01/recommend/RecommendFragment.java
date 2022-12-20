package com.example.androidtest01.recommend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.common.CommonMethod;
import com.example.androidtest01.common.BlogItem;
import com.example.androidtest01.blog.BlogDTO;

import java.util.ArrayList;


public class RecommendFragment extends Fragment {
    RecyclerView recv_rcm_list1, recv_rcm_moment, recv_rcm_list2, recv_rcm_video, recv_rcm_hotiopic, recv_rcm_list3, recv_rcm_list4;
    ArrayList<BlogDTO> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recommend, container, false);

        BlogItem item = new BlogItem();
        list = item.getPostingItem();

        recv_rcm_list1 = v.findViewById(R.id.recv_rcm_list1);
        recv_rcm_moment = v.findViewById(R.id.recv_rcm_moment);
        recv_rcm_list2 = v.findViewById(R.id.recv_rcm_list2);
        recv_rcm_video = v.findViewById(R.id.recv_rcm_video);
        recv_rcm_list3 = v.findViewById(R.id.recv_rcm_list3);
        recv_rcm_hotiopic = v.findViewById(R.id.recv_rcm_hotiopic);
        recv_rcm_list4 = v.findViewById(R.id.recv_rcm_list4);

        ListAdapter1 adapter_list1 = new ListAdapter1(inflater, getContext(), list);
        ListAdapter2 adapter_list2 = new ListAdapter2(inflater, getContext(), list);
        ListAdapter3 adapter_list3 = new ListAdapter3(inflater, getContext(), list);
        ListAdapter4 adapter_list4 = new ListAdapter4(inflater, getContext(), list);
        MomentAdapter adapter_moment = new MomentAdapter(inflater, getContext(), list);
        TopicAdapter adapter_topic = new TopicAdapter(inflater,getContext(), list);
        VideoAdapter adapter_video = new VideoAdapter(inflater);


        recv_rcm_list1.setAdapter(adapter_list1);
        recv_rcm_list1.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
        recv_rcm_list2.setAdapter(adapter_list2);
        recv_rcm_list2.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
        recv_rcm_list3.setAdapter(adapter_list3);
        recv_rcm_list3.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
        recv_rcm_list4.setAdapter(adapter_list4);
        recv_rcm_list4.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
        recv_rcm_moment.setAdapter(adapter_moment);
        recv_rcm_moment.setLayoutManager(CommonMethod.getManagerHorizontal(getContext()));
        recv_rcm_video.setAdapter(adapter_video);
        recv_rcm_video.setLayoutManager(CommonMethod.getManagerHorizontal(getContext()));
        recv_rcm_hotiopic.setAdapter(adapter_topic);
        recv_rcm_hotiopic.setLayoutManager(CommonMethod.getManagerHorizontal(getContext()));

        return v;
    }
}