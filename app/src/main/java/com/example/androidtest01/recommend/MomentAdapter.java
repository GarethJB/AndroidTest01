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
import com.example.androidtest01.moment.MomentActivity;
import com.example.androidtest01.blog.BlogDTO;

import java.util.ArrayList;

public class MomentAdapter extends RecyclerView.Adapter<MomentAdapter.ViewHolder>{
    LayoutInflater inflater;
    Context context;
    ArrayList<BlogDTO> list;

    public MomentAdapter(LayoutInflater inflater, Context context, ArrayList<BlogDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recommend_moment, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.imgv_photo.setImageResource(list.get(i).getPhoto());
        h.imgv_profile.setImageResource(list.get(i).getProfile());
        h.tv_contents.setText(list.get(i).getContents());

        final int idx = i;
        h.line_go_posting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MomentActivity.class);
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
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout line_go_posting;
        ImageView imgv_photo, imgv_profile;
        TextView tv_contents;
        public ViewHolder(@NonNull View v) {
            super(v);
            line_go_posting = v.findViewById(R.id.line_go_posting);
            imgv_photo = v.findViewById(R.id.imgv_photo);
            imgv_profile = v.findViewById(R.id.imgv_profile);
            tv_contents = v.findViewById(R.id.tv_contents);

        }
    }
}
