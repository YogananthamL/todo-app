package com.project.todoapp.controller;

import com.project.todoapp.entity.Todo;
import com.project.todoapp.service.TodoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ToDoController {

    private TodoServiceImpl service;
    public ToDoController(TodoServiceImpl service){
        this.service=service;
    }

    @GetMapping("/todo-list")
    public String findAll(Model model){
        model.addAttribute("Todo",service.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String form(Model model){
        Todo todo=new Todo();
        model.addAttribute("todo",todo);
        return"add-task";

    }
    @PostMapping("/save")
    public String save(@ModelAttribute("todo") Todo todo){
        service.insert(todo);
        return"redirect:/todo-list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("todoId") int id){
        service.deleteById(id);
        return"redirect:/todo-list";
    }


}
