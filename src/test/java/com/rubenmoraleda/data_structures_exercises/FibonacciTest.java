package com.rubenmoraleda.data_structures_exercises;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase {

    protected Fibonacci _fibonacci;

    public void setUp() throws Exception {
        super.setUp();
        _fibonacci = new Fibonacci();
    }

    public void testN0() {
        long expected = 0L;
        assertEquals(expected, _fibonacci.get(0));
    }

    public void testN1() {
        long expected = 1L;
        assertEquals(expected, _fibonacci.get(1));
    }

    public void testN2() {
        long expected = 1L;
        assertEquals(expected, _fibonacci.get(2));
    }

    public void testN3() {
        long expected = 2L;
        assertEquals(expected, _fibonacci.get(3));
    }

    public void testN4() {
        long expected = 3L;
        assertEquals(expected, _fibonacci.get(4));
    }

    public void testN50() {
        long expected = 12586269025L;
        assertEquals(expected, _fibonacci.get(50));
    }
}