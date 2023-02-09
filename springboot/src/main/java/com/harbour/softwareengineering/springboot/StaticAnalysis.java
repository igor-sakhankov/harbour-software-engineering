package com.harbour.softwareengineering.springboot;

import java.util.Random;

public class StaticAnalysis {

    public void myMethod() {
        var a = new Random().nextInt();

        var b = 10/ a;

        System.out.println(b);
    }

}
