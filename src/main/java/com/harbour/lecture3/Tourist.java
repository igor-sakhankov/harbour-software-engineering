package com.harbour.lecture3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Tourist {

    public Tourist() {
        System.out.println("Tourist was created");
    }

    @Autowired
    private CarryOnBaggage carryOnBaggage;

    @Autowired
    private CheckedBaggage checkedBaggage;

    @Autowired
    private ApplicationContext context;

    public void securityCheck() {
        System.out.println(String.format("I have coffe %s", context.getBean("coffee")));
    }

}
