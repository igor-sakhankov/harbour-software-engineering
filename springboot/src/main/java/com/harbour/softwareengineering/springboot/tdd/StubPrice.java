package com.harbour.softwareengineering.springboot.tdd;

import java.math.BigDecimal;

public class StubPrice implements Price {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("30");
    }
}
