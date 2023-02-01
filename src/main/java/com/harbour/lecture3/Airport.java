package com.harbour.lecture3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Airport {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Airport.class);

        var t = context.getBean("tourist", Tourist.class);

        t.securityCheck();
        t.securityCheck();



    }

}
