package com.harbour.softwareengineering.springboot.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class TicketRevenueTest {

    private final TicketRevenue venueRevenue = new TicketRevenue();
    private final String name = "NAME";

    //Incorrect input: non integer
    // -3 |min 0 1        33          99  max 100 | 101 105

    @Test
    void estimateTotalRevenue_whenLessThanOneTicketSold_shouldThrow() {
        // given
        var numberOfTickets = 0;

        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> venueRevenue.estimateTotalRevenue(numberOfTickets));
    }

    private List<Ticket> getTickets(int numberOfTickets) {
        List<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i < numberOfTickets; i++) {
            tickets.add(new Ticket());
        }
        return tickets;
    }

    @Test
    void estimateTotalRevenue_whenZeroTicketSold_shouldReturn() {
        // given
        var numberOfTickets = 0;
        var expectedRevenue = new BigDecimal("0");

        // when
        var totalRevenue = venueRevenue.estimateTotalRevenue(numberOfTickets);

        // then
        assertEquals(expectedRevenue, totalRevenue);
    }

    @Test
    void estimateTotalRevenue_whenMoreThan100TicketSold_shouldThrow() {
        // given
        var numberOfTickets = 105;

        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> venueRevenue.estimateTotalRevenue(numberOfTickets));
    }

    @Test
    void oneTicketSoldIsThirtyInRevenue() {
        // given
        var numberOfTickets = 1;
        var expectedRevenue = new BigDecimal("30");

        // when
        var totalRevenue = venueRevenue.estimateTotalRevenue(numberOfTickets);

        // then
        assertEquals(expectedRevenue, totalRevenue);
    }

    @Test
    void moreTicketSoldIsThirtyInRevenue() {
        // given
        var numberOfTickets = 5;
        var expectedRevenue = new BigDecimal("150");

        // when
        var totalRevenue = venueRevenue.estimateTotalRevenue(numberOfTickets);

        // then
        assertEquals(expectedRevenue, totalRevenue);
    }

    @Test
    void moreTicketSold2IsThirtyInRevenue() {
        // given
        var numberOfTickets = 10;
        var expectedRevenue = new BigDecimal("300");

        // when
        var totalRevenue = venueRevenue.estimateTotalRevenue(numberOfTickets);

        // then
        assertEquals(expectedRevenue, totalRevenue);
    }
}
