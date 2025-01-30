package com.example.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    @Test
    void testUserController() {
        String expected = "User Details";
        String actual = getUserDetails();
        assertEquals(expected, actual, "User details should match");
    }

    String getUserDetails() {
        return "User Details";  // Simulated logic
    }
}
