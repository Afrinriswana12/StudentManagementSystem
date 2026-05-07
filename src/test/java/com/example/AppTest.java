package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        double total = 100 + 200;
        assertEquals(300, total);
    }

    @Test
    public void testZero() {
        double total = 0;
        assertEquals(0, total);
    }
}