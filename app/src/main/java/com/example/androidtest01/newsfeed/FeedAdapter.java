package com.example.androidtest01.newsfeed;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.comment.CommentActivity;
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
        View v = inflater.inflate(R.layout.item_newsfeed_feed, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.imgv_feed_profile.setImageResource(list.get(i).getProfile());
        h.imgv_feed_photo.setImageResource(list.get(i).getPhoto());
        h.tv_feed_name.setText(list.get(i).getName());
        h.tv_feed_date.setText(list.get(i).getDate());
        h.tv_feed_title.setText(list.get(i).getTitle());
        h.tv_feed_contents.setText(list.get(i).getContents());

        final int idx = i;
        h.line_newsfeed_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostingActivity.class);
                intent.putExtra("dto", list.get(idx));// 오류 발생 원인 : ?
                context.startActivity(intent);
            }
        });
        h.rel_go_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CommentActivity.class);
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
        return 7;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout line_newsfeed_content;
        RelativeLayout rel_go_comment;
        ImageView imgv_feed_profile, imgv_feed_photo;
        TextView tv_feed_name, tv_feed_date, tv_feed_title, tv_feed_contents;
        public ViewHolder(@NonNull View v) {
            super(v);
            line_newsfeed_content = v.findViewById(R.id.line_newsfeed_content);
            rel_go_comment = v.findViewById(R.id.rel_go_comment);
            imgv_feed_profile = v.findViewById(R.id.imgv_feed_profile);
            imgv_feed_photo = v.findViewById(R.id.imgv_feed_photo);
            tv_feed_name = v.findViewById(R.id.tv_feed_name);
            tv_feed_date = v.findViewById(R.id.tv_feed_date);
            tv_feed_title = v.findViewById(R.id.tv_feed_title);
            tv_feed_contents = v.findViewById(R.id.tv_feed_contents);
        }
    }
}
