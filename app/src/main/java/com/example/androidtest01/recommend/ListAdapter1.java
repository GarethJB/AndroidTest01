package com.example.androidtest01.recommend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.posting.PostingActivity;
import com.example.androidtest01.posting.PostingDTO;

import java.util.ArrayList;

public class ListAdapter1 extends RecyclerView.Adapter<ListAdapter1.ViewHoler>{
    LayoutInflater inflater;
    Context context;
    ArrayList<PostingDTO> list;

    public ListAdapter1(LayoutInflater inflater, Context context, ArrayList<PostingDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recommend_list1, parent, false);
        ViewHoler viewHoler = new ViewHoler(v);
        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler h, int i) {
        h.tv_title.setText(list.get(i).getTitle());
        h.tv_name.setText(list.get(i).getName());
        h.tv_date.setText(list.get(i).getDate());
        h.tv_likes.setText(list.get(i).getLikes());
        h.tv_comments.setText(list.get(i).getComments());
        h.imgv_photo.setImageResource(list.get(i).getPhoto());

        final int idx = i;
        h.line_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostingActivity.class);
                intent.putExtra("dto", list.get(idx));// 오류 발생 원인 : ?
                context.startActivity(intent);
            }
        });

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        LinearLayout line_list;
        TextView tv_title, tv_name, tv_date, tv_likes, tv_comments;
        ImageView imgv_photo;

        public ViewHoler(@NonNull View v) {
            super(v);
            line_list = v.findViewById(R.id.line_list);
            tv_title = v.findViewById(R.id.tv_title);
            tv_name = v.findViewById(R.id.tv_name);
            tv_date = v.findViewById(R.id.tv_date);
            tv_likes = v.findViewById(R.id.tv_likes);
            tv_comments = v.findViewById(R.id.tv_comments);
            imgv_photo = v.findViewById(R.id.imgv_photo);
        }
    }
}
