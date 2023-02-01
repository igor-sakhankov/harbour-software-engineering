package com.harbour.lecture3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class CarryOnBaggage {

    public CarryOnBaggage() {
        System.out.println("CarryOnBaggage was created");
    }

}
