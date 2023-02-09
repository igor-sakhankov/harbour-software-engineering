package com.harbour.softwareengineering.springboot.tdd;

import java.math.BigDecimal;
import java.util.Random;

public class HttpPrice implements Price{

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(new Random().nextInt());
    }
}
