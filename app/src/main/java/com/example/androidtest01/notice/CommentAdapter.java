package com.example.androidtest01.notice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;
import com.example.androidtest01.blog.BlogDTO;
import com.example.androidtest01.comment.CommentActivity;
import com.example.androidtest01.posting.PostingActivity;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder>{
    LayoutInflater inflater;
    Context context;
    ArrayList<BlogDTO> list;

    public CommentAdapter(LayoutInflater inflater, Context context, ArrayList<BlogDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_notice_comment, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.tv_title.setText(list.get(i).getTitle());
        h.tv_name.setText(list.get(i).getName());
        h.tv_comment.setText(list.get(i).getComment());
        h.tv_date.setText(list.get(i).getDate());

        final int idx = i;
        h.line_go_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CommentActivity.class);
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
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout line_go_comment;
        TextView tv_name, tv_title, tv_comment, tv_date;
        public ViewHolder(@NonNull View v) {
            super(v);
            line_go_comment = v.findViewById(R.id.line_go_comment);
            tv_name = v.findViewById(R.id.tv_name);
            tv_title = v.findViewById(R.id.tv_title);
            tv_comment = v.findViewById(R.id.tv_comment);
            tv_date = v.findViewById(R.id.tv_date);
        }
    }
}
