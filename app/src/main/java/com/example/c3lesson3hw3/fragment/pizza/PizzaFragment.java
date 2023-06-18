package com.example.c3lesson3hw3.fragment.pizza;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.c3lesson3hw3.R;
import com.example.c3lesson3hw3.fragment.GenericAdapter;
import com.example.c3lesson3hw3.fragment.dressing.DressingFragment;

import java.util.ArrayList;
import java.util.List;

public class PizzaFragment extends Fragment {

    private static final int ITEM_PIZZA = R.layout.item_pizza;
    private static final int TV_PIZZA = R.id.tv_pizza;
    private static final int RV_PIZZA = R.id.rv_pizza;
    private static final int BTN_NEXT = R.id.btn_next;
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
        List<String> pizzaList = new ArrayList<>();
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
        return pizzaList;
    }
}