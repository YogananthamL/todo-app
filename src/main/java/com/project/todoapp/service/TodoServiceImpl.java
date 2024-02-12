package com.project.todoapp.service;

import com.project.todoapp.dao.TodoDao;
import com.project.todoapp.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    private TodoDao dao;

    @Autowired
    public TodoServiceImpl(TodoDao dao){
        this.dao=dao;
    }
    @Override
    public List<Todo> findAll() {
        return dao.findAll() ;
    }

    @Override
    public void insert(Todo todo) {
        dao.save(todo);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
