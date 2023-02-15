package com.harbour.softwareengineering.springboot.dictionaries;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class OxfordDictionary implements IDictionary {

    @Override
    public String get(String word) {
        "sdfsdfsdfasdfasd".substring(10, 3);
        return "hello from oxford: " + word;
    }


//    public List<String> getList() {
//        return List.of(
//            "1",
//            "2"
//        );
//    }

        public List<String> getList() {
        return List.of(
            "new implementation",
            "2"
        );
    }
}
