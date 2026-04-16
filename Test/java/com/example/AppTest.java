package com.library;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testFineCalculation() {
        App.User user = new App.User();
        user.daysBorrowed = 10; // 3 days overdue
        assertEquals(15.0, user.calculateFine(), "Fine should be 15.0 for 3 days late");
    }

    @Test
    public void testNoFine() {
        App.User user = new App.User();
        user.daysBorrowed = 5; // Within 7-day limit
        assertEquals(0.0, user.calculateFine(), "Fine should be 0.0 if returned on time");
        System.out.println("After modification");
    }
}
