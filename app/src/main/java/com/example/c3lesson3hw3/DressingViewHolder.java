package com.example.c3lesson3hw3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DressingViewHolder extends RecyclerView.ViewHolder {
    private TextView tvDressing;
    public DressingViewHolder(@NonNull View itemView) {
        super(itemView);
        tvDressing = itemView.findViewById(R.id.tv_dressing);
    }
    public void bind(String dressingType) {
        tvDressing.setText(dressingType);
    }
}

