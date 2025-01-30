package com.nikijv.unittesting.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManagerTest {

    private StringManager manager;

    @BeforeEach
    void setUp() {
        manager = new StringManager();
    }

    @Test
    void isPalindrome() {
        assertTrue(manager.isPalindrome("A bo b a"));
    }

    @Test
    void getVowelsCount() {
        assertEquals(4, manager.getVowelsCount("academy"));
    }

    @Test
    void getConsonantsCount() {
        assertEquals(3, manager.getConsonantsCount("academy"));
    }

    @Test
    void getMatchesCount() {
        assertEquals(3, manager.getMatchesCount("This string is a test string. The testing string looks great", "string"));
    }
}