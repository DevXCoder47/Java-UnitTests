package com.nikijv.unittesting.length;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthsManagerTest {

    private LengthsManager manager;
    @BeforeEach
    void setUp() {
        manager = new LengthsManager();
    }

    @Test
    void getMillimetersFromCentimeters() {
        assertEquals(300, manager.getMillimetersFromCentimeters(30));
    }

    @Test
    void getMillimetersFromDecimeters() {
        assertEquals(4000, manager.getMillimetersFromDecimeters(40));
    }

    @Test
    void getMillimetersFromMeters() {
        assertEquals(2000, manager.getMillimetersFromMeters(2));
    }

    @Test
    void getMillimetersFromKilometers() {
        assertEquals(1000000, manager.getMillimetersFromKilometers(1));
    }
}