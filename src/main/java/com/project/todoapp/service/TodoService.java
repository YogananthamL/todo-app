package com.project.todoapp.service;

import com.project.todoapp.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();

    void insert(Todo todo);
    void deleteById(int id);
}
