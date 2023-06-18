package com.example.c3lesson3hw3.service;

import java.util.List;

public interface Service<T> {
    List<T> findAll();
}
