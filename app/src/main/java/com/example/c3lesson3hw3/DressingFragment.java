package com.example.c3lesson3hw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class DressingFragment extends Fragment {

    private RecyclerView rvDressing;
    private Button btnToTopping;
    private DressingAdapter dressingAdapter;
    private ArrayList<String> dressingList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dressing, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
        loadData();
        dressingAdapter = new DressingAdapter(dressingList);
        rvDressing.setAdapter(dressingAdapter);
    }

    private void initView() {
        rvDressing = requireActivity().findViewById(R.id.rv_dressing);
        btnToTopping = requireActivity().findViewById(R.id.btn_to_topping);
    }

    private void initListener() {
        btnToTopping.setOnClickListener(v -> {
            ToppingFragment toppingFragment = new ToppingFragment();
            Log.d("package:com.example.c3lesson3hw3", "test");
            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container_pizza, toppingFragment)
                    .addToBackStack(null)
                    .commit();
        });

    }

    private void loadData() {
        dressingList.add("Горчица");
        dressingList.add("Кетчуп");
        dressingList.add("Майонез");
        dressingList.add("Сметана");
        dressingList.add("Кесадилья");
        dressingList.add("Для мант");
        dressingList.add("Для самс");
        dressingList.add("Сырный");
        dressingList.add("Тар-Тар");
        dressingList.add("Цезарь");
    }
}