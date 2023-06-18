package com.example.c3lesson3hw3.repository.pizza;

import com.example.c3lesson3hw3.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class PizzaInMemoryRepository implements Repository<String> {
    private final List<String> pizzaList = new ArrayList<>();

    public PizzaInMemoryRepository() {
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

    @Override
    public List<String> findAll() {
        return pizzaList;
    }
}
