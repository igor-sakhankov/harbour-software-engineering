package com.harbour.softwareengineering.springboot.dictionaries;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyNiceDictionary implements IDictionary {

    @Override
    public String get(String word) {
        return "hello from Cambridge: " + word;
    }

}
