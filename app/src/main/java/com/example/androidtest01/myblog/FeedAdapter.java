package com.example.androidtest01.myblog;

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
import com.example.androidtest01.blog.BlogDTO;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder>{
    LayoutInflater inflater;
    Context context;
    ArrayList<BlogDTO> list;

    public FeedAdapter(LayoutInflater inflater, Context context, ArrayList<BlogDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_myblog_feed, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.tv_date.setText(list.get(i).getDate());
        h.tv_neighbor.setText(list.get(i).getNeighbor()+"");
        h.tv_title.setText(list.get(i).getTitle());
        h.tv_contents.setText(list.get(i).getContents());
        h.tv_likes.setText(list.get(i).getLikes()+"");
        h.tv_comments.setText(list.get(i).getComments()+"");
        h.imgv_photo.setImageResource(list.get(i).getPhoto());

        final int idx = i;
        h.line_go_posting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostingActivity.class);
                intent.putExtra("dto", list.get(idx));
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
        TextView tv_date, tv_neighbor, tv_title, tv_contents, tv_likes, tv_comments;
        ImageView imgv_photo;
        public ViewHolder(@NonNull View v) {
            super(v);
            line_go_posting = v.findViewById(R.id.line_go_posting);
            tv_date = v.findViewById(R.id.tv_date);
            tv_neighbor = v.findViewById(R.id.tv_neighbor);
            tv_title = v.findViewById(R.id.tv_title);
            tv_contents = v.findViewById(R.id.tv_contents);
            tv_likes = v.findViewById(R.id.tv_likes);
            tv_comments = v.findViewById(R.id.tv_comments);
            imgv_photo = v.findViewById(R.id.imgv_photo);
        }
    }
}
