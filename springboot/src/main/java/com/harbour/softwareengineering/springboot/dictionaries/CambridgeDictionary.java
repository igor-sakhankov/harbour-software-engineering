package com.harbour.softwareengineering.springboot.dictionaries;

import org.springframework.stereotype.Component;

@Component
public class CambridgeDictionary implements IDictionary {

    @Override
    public String get(String word) {
        return "hello from Cambridge: " + word;
    }

}
