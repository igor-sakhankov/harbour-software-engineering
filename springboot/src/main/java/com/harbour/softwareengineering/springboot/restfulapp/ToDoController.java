package com.harbour.softwareengineering.springboot.restfulapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService service;

    @GetMapping("/v1/todo/items/{id}")
    public ListVM getItems(@PathVariable("id") long id) {
        final var strings = service.getActiveItems();
        var vm = new ListVM();
        vm.items = strings;
        return vm;
    }

    @PostMapping("/v1/todo/items/{id}")
    public void updateItem(
        @PathVariable("id") long id,
        @RequestBody ListVM vm,
        @RequestHeader(name = "x-glovo-chaos-monkey-http-status-code") String myCustomHeader,
        @RequestParam(name = "test") String test
    ) {
        final var strings = service.getActiveItems();
    }

}
