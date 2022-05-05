package com.todo.todoapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
    @ExceptionHandler(TodoNotFoundException.class)
    public ResponseEntity<String> handlesNotFoundException(TodoNotFoundException exception) {
        return new ResponseEntity<>("Todo item not found", HttpStatus.NOT_FOUND);
    }
}
