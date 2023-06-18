package com.example.c3lesson3hw3.service;

import com.example.c3lesson3hw3.repository.Repository;
import com.example.c3lesson3hw3.repository.RepositoryDecorator;
import com.example.c3lesson3hw3.repository.cache.CacheRepository;
import com.example.c3lesson3hw3.repository.pizza.PizzaInMemoryRepository;

import java.util.List;

public class PizzaService implements Service<String> {
    private final Repository<String> pizzaService = new RepositoryDecorator(
            new PizzaInMemoryRepository(),
            new CacheRepository());

    @Override
    public List<String> findAll() {
        return pizzaService.findAll();
    }
}
