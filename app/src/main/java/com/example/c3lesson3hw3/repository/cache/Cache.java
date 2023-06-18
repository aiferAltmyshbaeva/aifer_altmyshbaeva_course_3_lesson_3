package com.example.c3lesson3hw3.repository.cache;

import java.util.List;

public interface Cache<T> {
    void save(List<T> values);

    boolean hasResult();

    List<T> load();
}
