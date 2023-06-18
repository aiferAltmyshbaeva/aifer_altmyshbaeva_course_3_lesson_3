package com.example.c3lesson3hw3.fragment.topping;

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

import java.util.ArrayList;
import java.util.List;

public class ToppingFragment extends Fragment {

    private static final int RV_TOPPING = R.id.rv_topping;
    private static final int ITEM_TOPPING = R.layout.item_topping;
    private static final int TV_TOPPING = R.id.tv_topping;
    private static final int BTN_FINISH = R.id.btn_finish;
    private RecyclerView rvTopping;
    private Button btnFinish;

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
        GenericAdapter toppingAdapter = new GenericAdapter(loadData(), ITEM_TOPPING, TV_TOPPING);
        rvTopping.setAdapter(toppingAdapter);
    }

    private void initView() {
        rvTopping = requireActivity().findViewById(RV_TOPPING);
        btnFinish = requireActivity().findViewById(BTN_FINISH);
    }

    private void initListener() {
        btnFinish.setOnClickListener(v -> getActivity().finishAffinity());
    }

    private List<String> loadData() {
        List<String> toppingList = new ArrayList<>();
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
        return toppingList;
    }

}

