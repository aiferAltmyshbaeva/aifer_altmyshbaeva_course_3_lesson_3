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

public class PizzaFragment extends Fragment {

    private RecyclerView rvPizza;
    private Button btnNext;
    private PizzaAdapter pizzaAdapter;
    private ArrayList<String> pizzaList = new ArrayList<>();



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
        loadData();
        pizzaAdapter = new PizzaAdapter(pizzaList);
        rvPizza.setAdapter(pizzaAdapter);
        initListener();
    }

    private void initView() {
        rvPizza = requireActivity().findViewById(R.id.rv_pizza);
        btnNext = requireActivity().findViewById(R.id.btn_next);
    }

    private void initListener() {
        btnNext.setOnClickListener(v -> {
            DressingFragment dressingFragment = new DressingFragment();
            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container_pizza, dressingFragment)
                    .addToBackStack(null)
                    .commit();

        });
    }

    private void loadData() {
        pizzaList.add("4 сыра");
        pizzaList.add("Барбекю");
        pizzaList.add("Вегетарианская");
        pizzaList.add("Гасконская");
        pizzaList.add("Деревенская");
        pizzaList.add("Детская");
        pizzaList.add("Домашняя");
        pizzaList.add("Итальянская");
        pizzaList.add("Карри");
        pizzaList.add("Классика");
        pizzaList.add("Комбо пицца");
        pizzaList.add("Куриная");
        pizzaList.add("Маргарита");
        pizzaList.add("Мегапепперони");
        pizzaList.add("Мексиканская");
        pizzaList.add("Обжорка");
        pizzaList.add("Охотничья");
        pizzaList.add("Пепперони");
        pizzaList.add("По-тайски");
        pizzaList.add("Супер сыр");
        pizzaList.add("Тропиканка");
        pizzaList.add("Фрикасе");
        pizzaList.add("Цезарь");
        pizzaList.add("Чили");
        pizzaList.add("Шашлычная с говядиной");
    }
}