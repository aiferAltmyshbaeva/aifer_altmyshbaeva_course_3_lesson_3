package com.example.c3lesson3hw3.repository.topping;

import com.example.c3lesson3hw3.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class ToppingInMemoryRepository implements Repository<String> {
    private final List<String> toppingList = new ArrayList<>();

    public ToppingInMemoryRepository() {
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

    @Override
    public List<String> findAll() {
        return toppingList;
    }
}
