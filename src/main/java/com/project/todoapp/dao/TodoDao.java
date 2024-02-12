package com.project.todoapp.dao;

import com.project.todoapp.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDao  extends JpaRepository<Todo,Integer> {
}
