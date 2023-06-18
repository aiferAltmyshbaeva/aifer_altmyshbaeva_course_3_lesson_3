package com.example.c3lesson3hw3.fragment.pizza;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.c3lesson3hw3.R;
import com.example.c3lesson3hw3.fragment.GenericAdapter;
import com.example.c3lesson3hw3.fragment.dressing.DressingFragment;
import com.example.c3lesson3hw3.service.PizzaService;
import com.example.c3lesson3hw3.service.Service;

import java.util.List;

public class PizzaFragment extends Fragment {

    private static final int ITEM_PIZZA = R.layout.item_pizza;
    private static final int TV_PIZZA = R.id.tv_pizza;
    private static final int RV_PIZZA = R.id.rv_pizza;
    private static final int BTN_NEXT = R.id.btn_next;
    final Service<String> pizzaService = new PizzaService();
    private RecyclerView rvPizza;
    private Button btnNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pizza, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        GenericAdapter pizzaAdapter = new GenericAdapter(loadData(), ITEM_PIZZA, TV_PIZZA);
        rvPizza.setAdapter(pizzaAdapter);
        initListener();
    }

    private void initView() {
        rvPizza = requireActivity().findViewById(RV_PIZZA);
        btnNext = requireActivity().findViewById(BTN_NEXT);
    }

    private void initListener() {
        btnNext.setOnClickListener(v -> requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_pizza, new DressingFragment())
                .addToBackStack(null)
                .commit()
        );
    }

    private List<String> loadData() {
        return pizzaService.findAll();
    }
}