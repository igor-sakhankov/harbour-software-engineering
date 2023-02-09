package com.harbour.softwareengineering.springboot.restfulapp;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private final ToDoRepository repository;

    public ToDoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public List<String> getActiveItems() {
        return repository.getActiveItems();
    }
}
