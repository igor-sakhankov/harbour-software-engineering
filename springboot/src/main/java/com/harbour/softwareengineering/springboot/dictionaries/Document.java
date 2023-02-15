package com.harbour.softwareengineering.springboot.dictionaries;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Document {

    @Autowired
    List<IDictionary> dictionaries;

    Map<String, IDictionary> strategies = new HashMap<>();


    @PostConstruct
    void init() {
        for (var d: dictionaries
        ) {
            strategies.put(d.name(), d);
        }

        var config = "OxfordDictionary";

        System.out.println(strategies.get(config).name());
    }

}
