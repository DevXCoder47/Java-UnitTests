package com.nikijv.unittesting.money;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyManagerTest {

    private MoneyManager manager;

    @BeforeEach
    void setUp() {
        manager = new MoneyManager();
    }

    @Test
    void getKopecksFromDollarCents() {
        long actual = manager.getKopecksFromDollarCents(100);
        long expected = (long)((100 / 100) / 41.9294) * 100;
        assertEquals(expected, actual);
    }

    @Test
    void getKopecksFromEuroCents() {
        long actual = manager.getKopecksFromEuroCents(100);
        long expected = (long)((100 / 100) / 43.6192) * 100;
        assertEquals(expected, actual);
    }

    @Test
    void getKopecksFromPenny() {
        long actual = manager.getKopecksFromPenny(100);
        long expected = (long)((100 / 100) / 52.0931) * 100;
        assertEquals(expected, actual);
    }

    @Test
    void getKopecksFromYen() {
        long actual = manager.getKopecksFromYen(100);
        long expected = (long)(100 / 0.2688) * 100;
        assertEquals(expected, actual);
    }
}