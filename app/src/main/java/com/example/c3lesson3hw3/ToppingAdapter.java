package com.example.c3lesson3hw3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ToppingAdapter extends RecyclerView.Adapter<ToppingViewHolder>{

    private ArrayList<String> toppingList;

    public ToppingAdapter(ArrayList<String> toppingList) {
        this.toppingList = toppingList;
    }
    @NonNull
    @Override
    public ToppingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ToppingViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topping, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ToppingViewHolder holder, int position) {
        holder.bind(toppingList.get(position));
    }

    @Override
    public int getItemCount() {
        return toppingList.size();
    }
}
