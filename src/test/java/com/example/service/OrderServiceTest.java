package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void testCreateOrder() {
        String expected = "Order Created";
        String actual = createOrder();
        assertEquals(expected, actual, "Order creation status should match");
    }

    String createOrder() {
        return "Order Created";  // Simulated logic
    }
}
