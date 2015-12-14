package com.epam.javauniversity.hw8;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestModelCounter {

    @Test
    public void testModelCounterTen() {
        assertEquals(new ModelCounter(10).demonstrateAndReturnLast(), new Integer(5));

    }

    @Test
    public void testModelCounterHundred() {
        assertEquals(new ModelCounter(100).demonstrateAndReturnLast(), new Integer(73));
    }
}