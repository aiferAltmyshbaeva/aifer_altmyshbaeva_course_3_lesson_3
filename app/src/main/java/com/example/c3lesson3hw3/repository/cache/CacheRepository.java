package com.example.c3lesson3hw3.repository.cache;

import java.util.ArrayList;
import java.util.List;

public class CacheRepository implements Cache<String> {
    private List<String> cache = new ArrayList<>();

    @Override
    public void save(List<String> values) {
        this.cache = values;
    }

    @Override
    public boolean hasResult() {
        return !cache.isEmpty();
    }

    @Override
    public List<String> load() {
        return cache;
    }
}
