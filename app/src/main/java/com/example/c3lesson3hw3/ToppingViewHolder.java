package com.example.c3lesson3hw3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ToppingViewHolder extends RecyclerView.ViewHolder{

    public ToppingViewHolder(@NonNull View itemView, ArrayList<String> toppingList, TextView tvTopping) {
        super(itemView);
        this.toppingList = toppingList;
        this.tvTopping = tvTopping;
    }

    private ArrayList<String> toppingList;
    private TextView tvTopping;

    public ToppingViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTopping = itemView.findViewById(R.id.tv_topping);
    }

    public void bind(String toppingType) {
        tvTopping.setText(toppingType);
    }

}




