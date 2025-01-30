package com.nikijv.unittesting.figure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureManagerTest {

    private FigureManager manager;

    @BeforeEach
    void setUp() {
        manager = new FigureManager();
    }

    @Test
    void getTriangleArea() {
        double actual = manager.getTriangleArea(4, 6);
        double expected = 0.5 * 4 * 6;
        assertEquals(expected, actual);
    }

    @Test
    void getRectangleArea() {
        double actual = manager.getRectangleArea(5, 5);
        double expected = 25;
        assertEquals(expected, actual);
    }

    @Test
    void getSquareArea() {
        double actual = manager.getSquareArea(7);
        double expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    void getRhombusArea() {
        double actual = manager.getRhombusArea(6, 9);
        double expected = 0.5 * 6 * 9;
        assertEquals(expected, actual);
    }
}