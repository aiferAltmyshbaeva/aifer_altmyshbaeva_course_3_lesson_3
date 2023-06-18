package com.example.c3lesson3hw3.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
}
