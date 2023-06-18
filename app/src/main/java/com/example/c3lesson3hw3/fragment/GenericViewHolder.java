package com.example.c3lesson3hw3.fragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GenericViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    public GenericViewHolder(@NonNull View itemView, int id) {
        super(itemView);
        textView = itemView.findViewById(id);
    }
    public void bind(String value) {
        textView.setText(value);
    }
}

