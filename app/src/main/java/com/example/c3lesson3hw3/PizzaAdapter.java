package com.example.c3lesson3hw3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {

    private ArrayList<String> pizzaList;

    public PizzaAdapter(ArrayList<String> pizzaList){
        this.pizzaList = pizzaList;
    }
    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PizzaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        holder.bind(pizzaList.get(position));
    }

    @Override
    public int getItemCount() {
        return pizzaList.size();
    }
}
