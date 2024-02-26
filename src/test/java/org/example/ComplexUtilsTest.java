package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexUtilsTest {
    Complex first, second, third;
    ComplexUtils utils;

    @BeforeEach
    void Init() {
        first = new Complex(6, 2);
        second = new Complex(8, 4);
        third = new Complex(-20, 12);
        utils = new ComplexUtils();
    }

    @Test
    void add() {
        Complex result = new Complex(14, 6);

        assertTrue(utils.equals(utils.add(first, second), result));
    }

    @Test
    void sub() {
        Complex result = new Complex(-2, -2);

        assertTrue(utils.equals(utils.sub(first, second), result));
    }

    @Test
    void mul() {
        Complex result = new Complex(40, 40);

        assertTrue(utils.equals(result, utils.mul(first, second)));
    }

    @Test
    void div() {
        Complex result = new Complex(0.7, -0.1);

        assertTrue(utils.equals(result, utils.div(first, second)));
    }

    @Test
    void module() {
        assertEquals(23.323807579381203, utils.module(third));
    }

    @Test
    void testEquals() {
        Complex result = new Complex(-14, 14);

        assertTrue(utils.equals(utils.add(first, third), result));
    }
}