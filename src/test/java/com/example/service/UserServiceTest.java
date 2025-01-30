package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @Test
    void testGetUser() {
        String expected = "John Doe";
        String actual = getUserName();
        assertEquals(expected, actual, "User name should match");
    }

    String getUserName() {
        return "John Doe";  // Simulated logic
    }
}
