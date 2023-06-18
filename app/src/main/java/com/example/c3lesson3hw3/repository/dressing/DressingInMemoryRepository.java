package com.example.c3lesson3hw3.repository.dressing;

import com.example.c3lesson3hw3.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class DressingInMemoryRepository implements Repository<String> {
    private final List<String> dressingList = new ArrayList<>();

    public DressingInMemoryRepository() {
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

    @Override
    public List<String> findAll() {
        return dressingList;
    }
}
