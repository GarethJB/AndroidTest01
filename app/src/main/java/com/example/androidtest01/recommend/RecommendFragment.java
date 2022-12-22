package com.example.androidtest01.recommend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.common.BlogItem;
import com.example.androidtest01.common.CommonMethod;

import java.util.ArrayList;


public class RecommendFragment extends Fragment {
    RecyclerView recv_rcm_list1, recv_rcm_moment, recv_rcm_list2, recv_rcm_hotiopic, recv_rcm_list3;
    ArrayList<BlogDTO> list1 = new ArrayList<>();
    ArrayList<BlogDTO> list2 = new ArrayList<>();
    ArrayList<BlogDTO> list3 = new ArrayList<>();
    ArrayList<BlogDTO> listMoment = new ArrayList<>();
    ArrayList<BlogDTO> listTopic = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recommend, container, false);

        BlogItem item = new BlogItem();
        list1 = item.getRecommendList1();
        list2 = item.getRecommendList2();
        list3 = item.getRecommendList3();
        listMoment = item.getRecommendMoment();
        listTopic = item.getRecommendTopic();

        recv_rcm_list1 = v.findViewById(R.id.recv_rcm_list1);
        recv_rcm_moment = v.findViewById(R.id.recv_rcm_moment);
        recv_rcm_list2 = v.findViewById(R.id.recv_rcm_list2);
        recv_rcm_list3 = v.findViewById(R.id.recv_rcm_list3);
        recv_rcm_hotiopic = v.findViewById(R.id.recv_rcm_hotiopic);

        ListAdapter1 adapter_list1 = new ListAdapter1(inflater, getContext(), list1);
        ListAdapter2 adapter_list2 = new ListAdapter2(inflater, getContext(), list2);
        ListAdapter3 adapter_list3 = new ListAdapter3(inflater, getContext(), list3);
        MomentAdapter adapter_moment = new MomentAdapter(inflater, getContext(), listMoment);
        TopicAdapter adapter_topic = new TopicAdapter(inflater,getContext(), listTopic);


        recv_rcm_list1.setAdapter(adapter_list1);
        recv_rcm_list1.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
        recv_rcm_list2.setAdapter(adapter_list2);
        recv_rcm_list2.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
        recv_rcm_list3.setAdapter(adapter_list3);
        recv_rcm_list3.setLayoutManager(CommonMethod.getManagerVertical(getContext()));
        recv_rcm_moment.setAdapter(adapter_moment);
        recv_rcm_moment.setLayoutManager(CommonMethod.getManagerHorizontal(getContext()));
        recv_rcm_hotiopic.setAdapter(adapter_topic);
        recv_rcm_hotiopic.setLayoutManager(CommonMethod.getManagerHorizontal(getContext()));

        return v;
    }
}