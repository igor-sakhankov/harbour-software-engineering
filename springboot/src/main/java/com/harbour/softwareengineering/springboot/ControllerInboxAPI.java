package com.harbour.softwareengineering.springboot;

import static org.springframework.http.ResponseEntity.ok;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerInboxAPI implements InboxApi {

    @Override
    public ResponseEntity<Item> createItem(Item body) {
        final var test = new Item();
        return ResponseEntity.ok(test);
    }

    @Override
    public ResponseEntity<List<Item>> getItems() {
        return ResponseEntity.ok(List.of(new Item()));
    }
}
