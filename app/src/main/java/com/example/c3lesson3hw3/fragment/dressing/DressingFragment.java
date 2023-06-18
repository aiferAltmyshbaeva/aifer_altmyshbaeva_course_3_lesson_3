package com.example.c3lesson3hw3.fragment.dressing;

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
import com.example.c3lesson3hw3.fragment.topping.ToppingFragment;
import com.example.c3lesson3hw3.service.DressingService;
import com.example.c3lesson3hw3.service.Service;

import java.util.List;

public class DressingFragment extends Fragment {

    private static final int ITEM_DRESSING = R.layout.item_dressing;
    private static final int TV_DRESSING = R.id.tv_dressing;
    private static final int RV_DRESSING = R.id.rv_dressing;
    private static final int BTN_TO_TOPPING = R.id.btn_to_topping;

    private final Service<String> dressingService = new DressingService();
    private RecyclerView rvDressing;
    private Button btnToTopping;

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
        GenericAdapter dressingAdapter = new GenericAdapter(loadData(), ITEM_DRESSING, TV_DRESSING);
        rvDressing.setAdapter(dressingAdapter);
    }

    private void initView() {
        rvDressing = requireActivity().findViewById(RV_DRESSING);
        btnToTopping = requireActivity().findViewById(BTN_TO_TOPPING);
    }

    private void initListener() {
        btnToTopping.setOnClickListener(v -> requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_pizza, new ToppingFragment())
                .addToBackStack(null)
                .commit()
        );

    }

    private List<String> loadData() {
        return dressingService.findAll();
    }
}