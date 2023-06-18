package com.example.c3lesson3hw3.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GenericAdapter extends RecyclerView.Adapter<GenericViewHolder> {
    private final List<String> values;
    private final int layoutId;
    private final int textViewId;

    public GenericAdapter(List<String> values, int layoutId, int textViewId) {
        this.values = values;
        this.layoutId = layoutId;
        this.textViewId = textViewId;
    }

    @NonNull
    @Override
    public GenericViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GenericViewHolder(LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false), textViewId);
    }

    @Override
    public void onBindViewHolder(@NonNull GenericViewHolder holder, int position) {
        holder.bind(values.get(position));
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}
