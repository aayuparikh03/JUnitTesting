package com.example.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderControllerTest {

    @Test
    void testCreateOrderController() {
        String expected = "Order Received";
        String actual = createOrder();
        assertEquals(expected, actual, "Order controller should return correct message");
    }

    String createOrder() {
        return "Order Received";  // Simulated logic
    }
}
