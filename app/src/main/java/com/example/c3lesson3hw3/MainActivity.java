package com.example.c3lesson3hw3;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFragment(R.id.container_pizza, new PizzaFragment());
    }

    private void createFragment(@IdRes int container_pizza, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().add(container_pizza, fragment).commit();
    }
}