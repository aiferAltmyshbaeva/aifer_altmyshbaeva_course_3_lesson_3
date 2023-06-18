package com.example.c3lesson3hw3.repository;

import com.example.c3lesson3hw3.repository.cache.Cache;

import java.util.List;

public class RepositoryDecorator implements Repository<String> {
    private final Repository<String> repository;
    private final Cache<String> cache;

    public RepositoryDecorator(Repository<String> repository, Cache<String> cache) {
        this.repository = repository;
        this.cache = cache;
    }

    @Override
    public List<String> findAll() {
        if (cache.hasResult()) {
            return cache.load();
        }
        List<String> pizzas = repository.findAll();
        cache.save(pizzas);
        return pizzas;
    }
}
