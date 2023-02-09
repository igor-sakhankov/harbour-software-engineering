package com.harbour.softwareengineering.springboot.tdd;

import java.math.BigDecimal;

public class TicketRevenue {

    public BigDecimal estimateTotalRevenue(int i) {

        if (i < 0 || i > 100) {
            throw new IllegalArgumentException(String.format("Number of tickets cannot be outside of allowed range [0, 100], received: %s", i));
        }

        return new BigDecimal("30").multiply(new BigDecimal(i));
    }
}
