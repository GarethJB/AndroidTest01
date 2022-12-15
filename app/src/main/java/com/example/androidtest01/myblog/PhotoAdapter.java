package com.example.androidtest01.myblog;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.posting.PostingActivity;
import com.example.androidtest01.blog.BlogDTO;

import java.util.ArrayList;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder>{
    LayoutInflater inflater;
    Context context;
    ArrayList<BlogDTO> list;

    public PhotoAdapter(LayoutInflater inflater, Context context, ArrayList<BlogDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_myblog_photo, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.imgv_photo1.setImageResource(list.get(i).getPhoto());
        h.imgv_photo2.setImageResource(list.get(i).getPhoto());
        h.imgv_photo3.setImageResource(list.get(i).getPhoto());

        final int idx = i;
        h.imgv_photo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostingActivity.class);
                intent.putExtra("dto", list.get(idx));
                context.startActivity(intent);
            }
        });

        h.imgv_photo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostingActivity.class);
                intent.putExtra("dto", list.get(idx*2));
                context.startActivity(intent);
            }
        });

        h.imgv_photo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostingActivity.class);
                intent.putExtra("dto", list.get(idx*3));
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
        ImageView imgv_photo1, imgv_photo2, imgv_photo3;
        public ViewHolder(@NonNull View v) {
            super(v);
            imgv_photo1 = v.findViewById(R.id.imgv_photo1);
            imgv_photo2 = v.findViewById(R.id.imgv_photo2);
            imgv_photo3 = v.findViewById(R.id.imgv_photo3);
        }
    }
}
