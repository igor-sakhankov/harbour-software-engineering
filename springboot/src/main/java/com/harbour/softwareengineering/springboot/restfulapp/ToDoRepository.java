package com.harbour.softwareengineering.springboot.restfulapp;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ToDoRepository {

    public List<String> getActiveItems() {
        return List.of("Complete Item 1", "Complete Item 2");
    }
}
