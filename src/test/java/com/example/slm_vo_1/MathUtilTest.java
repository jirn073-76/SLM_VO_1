package com.example.slm_vo_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    MathUtil m = new MathUtil();

    @Test
    void sumTest() {
        // Arrange
        int a = 5, b = 6, exp = 11;

        // Act
        double res = m.add(5,6);

        // Assert
        assertEquals(exp, res);
    }

    @Test
    void absTest() {
        // Arrange
        int a = -5, exp = 5;

        // Act
        double res = m.abs(a);

        // Assert
        assertEquals(5, res);
    }

    @Test
    void minusTest() {
        // Arrange
        int a = 2, b = 2, exp = 0;

        // Act
        double res = m.minus(a, b);

        // Assert
        assertEquals(res, exp);
    }


    @Test
    void squareTest() {
        // Arrange
        int a = 2, exp = 4;

        // Act
        double res = m.square(a);

        // Assert
        assertEquals(res, exp);
    }

    @Test
    void powTest() {
        // Arrange
        int a = 2, b = 2, exp = 4;

        // Act
        double res = m.pow(a, b);

        // Assert
        assertEquals(res, exp);
    }

    @Test
    void divideTest() {
        // Arrange
        int a = 4, b = 0;

        // Act
        // Assert
        assertThrows(ArithmeticException.class, () -> m.divide(a,b));
    }
}