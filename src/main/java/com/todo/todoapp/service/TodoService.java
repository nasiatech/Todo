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

    public Long saveTodo(Todo todo){
        if(todo.getDone() == null){
            todo.setDone(false);
        }
        todoRepo.save(todo);
        return todo.getId();
    }

    public String deleteTodo(Long id) {

        if(todoRepo.existsById(id)) {
            todoRepo.deleteById(id);
        }
        else {
            throw new TodoNotFoundException();
        }

        return "Todo has been deleted";
    }

}
