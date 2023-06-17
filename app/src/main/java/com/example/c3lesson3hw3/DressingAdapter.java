package com.example.c3lesson3hw3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DressingAdapter extends RecyclerView.Adapter<DressingViewHolder> {
    private ArrayList<String> dressingList;

    public DressingAdapter(ArrayList<String> dressingList) {
        this.dressingList = dressingList;
    }

    @NonNull
    @Override
    public DressingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DressingViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dressing, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DressingViewHolder holder, int position) {
        holder.bind(dressingList.get(position));
    }

    @Override
    public int getItemCount() {
        return dressingList.size();
    }
}
