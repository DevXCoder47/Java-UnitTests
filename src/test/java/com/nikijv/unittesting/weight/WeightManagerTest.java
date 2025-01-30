package com.nikijv.unittesting.weight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightManagerTest {

    private WeightManager manager;
    @BeforeEach
    void setUp() {
        manager = new WeightManager();
    }

    @Test
    void getMilligramsFromGrams() {
        assertEquals(12000, manager.getMilligramsFromGrams(12));
    }

    @Test
    void getMilligramsFromKiloGrams() {
        assertEquals(3000000, manager.getMilligramsFromKiloGrams(3));
    }

    @Test
    void getMilligramsFromCentners() {
        assertEquals(100000000, manager.getMilligramsFromCentners(1));
    }

    @Test
    void getMilligramsFromTons() {
        assertEquals(2000000000, manager.getMilligramsFromTons(2));
    }
}