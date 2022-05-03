package com.todo.todoapp.repo;

import com.todo.todoapp.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo, Long> {
}
