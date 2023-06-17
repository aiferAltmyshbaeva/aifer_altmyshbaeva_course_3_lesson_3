package com.example.c3lesson3hw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class ToppingFragment extends Fragment {

    private RecyclerView rvTopping;
    private Button btnFinish;
    private ToppingAdapter toppingAdapter;
    private ArrayList<String> toppingList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_topping, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
        loadData();
        toppingAdapter = new ToppingAdapter(toppingList);
        rvTopping.setAdapter(toppingAdapter);
    }

    private void initView() {
        rvTopping = requireActivity().findViewById(R.id.rv_topping);
        btnFinish = requireActivity().findViewById(R.id.btn_finish);
    }

    private void initListener() {
        btnFinish.setOnClickListener(v -> {
            getActivity().finishAffinity();
        });
    }

    private void loadData() {
        toppingList.add("Сыр");
        toppingList.add("Грибы");
        toppingList.add("Помидоры");
        toppingList.add("Колбаски");
        toppingList.add("Оливки");
        toppingList.add("Острые перчики");
        toppingList.add("Листья салата");
        toppingList.add("Болгарский перец");
        toppingList.add("Кукуруза");
        toppingList.add("Ананас");
        toppingList.add("Зелень");
        toppingList.add("Куриная грудка");
    }

}

