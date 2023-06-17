package com.example.c3lesson3hw3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PizzaViewHolder extends RecyclerView.ViewHolder {

    private TextView tvPizza;

    public PizzaViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPizza = itemView.findViewById(R.id.tv_pizza);
    }

    public void bind(String pizzaName) {
        tvPizza.setText(pizzaName);
    }
}
