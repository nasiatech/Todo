package com.todo.todoapp.controller;

import com.todo.todoapp.exceptions.TodoNotFoundException;
import com.todo.todoapp.models.Todo;
import com.todo.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    private final TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> findAll(){
        return todoService.listTodo();
    }
    @PostMapping()
    public Long save(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }

    @PutMapping
    public Long update(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable("id") Long id) {
        return todoService.deleteTodo(id);

    }
}
