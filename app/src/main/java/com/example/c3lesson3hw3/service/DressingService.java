package com.example.c3lesson3hw3.service;

import com.example.c3lesson3hw3.repository.Repository;
import com.example.c3lesson3hw3.repository.RepositoryDecorator;
import com.example.c3lesson3hw3.repository.cache.CacheRepository;
import com.example.c3lesson3hw3.repository.dressing.DressingInMemoryRepository;

import java.util.List;

public class DressingService implements Service<String> {
    private final Repository<String> repository = new RepositoryDecorator(
            new DressingInMemoryRepository(),
            new CacheRepository());

    @Override
    public List<String> findAll() {
        return repository.findAll();
    }
}
