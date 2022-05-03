package com.todo.todoapp.models;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Todo {

    private Long Id;

    @NotNull
    private String title;
    private String description;
    private boolean done;
    private Long id;

    public Todo(){

    }
    public Todo(Long Id, String title,String description, boolean done){
        this.Id = Id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
