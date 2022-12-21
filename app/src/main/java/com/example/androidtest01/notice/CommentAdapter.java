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
import com.example.androidtest01.blog.CommentDTO;
import com.example.androidtest01.comment.CommentActivity;
import com.example.androidtest01.posting.PostingActivity;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder>{
    LayoutInflater inflater;
    Context context;
    ArrayList<CommentDTO> c_list;
    ArrayList<BlogDTO> b_list;

    public CommentAdapter(LayoutInflater inflater, Context context, ArrayList<CommentDTO> c_list, ArrayList<BlogDTO> b_list) {
        this.inflater = inflater;
        this.context = context;
        this.c_list = c_list;
        this.b_list = b_list;
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
        h.tv_comment.setText(c_list.get(i).getName() + "님이" + c_list.get(i).getTitle() + "에 답글을 달았습니다.");
        h.tv_content.setText(c_list.get(i).getComment());
        h.tv_date.setText(c_list.get(i).getDate());

        final int idx = i;
        h.line_go_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CommentActivity.class);
                intent.putExtra("dto", b_list.get(idx));
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
        return 8;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout line_go_comment;
        TextView tv_comment, tv_content, tv_date;
        public ViewHolder(@NonNull View v) {
            super(v);
            line_go_comment = v.findViewById(R.id.line_go_comment);
            tv_comment = v.findViewById(R.id.tv_comment);
            tv_content = v.findViewById(R.id.tv_content);
            tv_date = v.findViewById(R.id.tv_date);
        }
    }
}
