package com.todo.todoapp.service;

import com.todo.todoapp.exceptions.TodoNotFoundException;
import com.todo.todoapp.models.Todo;
import com.todo.todoapp.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;

    public List<Todo> listTodo(){
        return todoRepo.findAll();
    }

    public Todo saveTodo(Todo todo){
        return todoRepo.save(todo);
    }

    public String deleteTodo(Long id) throws TodoNotFoundException {
        String todoStatus = "";

        if(todoRepo.findById(id).isPresent()) {
            todoRepo.deleteById(id);
        }
        else {
            throw new TodoNotFoundException("Todo does not exist");
        }

        return todoStatus;
    }

}
