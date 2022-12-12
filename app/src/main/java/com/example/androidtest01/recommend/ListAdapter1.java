package com.example.androidtest01.recommend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtest01.R;

public class ListAdapter1 extends RecyclerView.Adapter<ListAdapter1.ViewHoler>{
    LayoutInflater inflater;

    public ListAdapter1(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recommend_list1, parent, false);
        ViewHoler viewHoler = new ViewHoler(v);
        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {

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

        public ViewHoler(@NonNull View v) {
            super(v);
        }
    }
}
