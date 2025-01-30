package com.nikijv.unittesting.length;

public class LengthsManager {
    public long getMillimetersFromCentimeters(long centimeters) {
        return centimeters * 10;
    }

    public long getMillimetersFromDecimeters(long decimeters) {
        return decimeters * 100;
    }

    public long getMillimetersFromMeters(long meters) {
        return meters * 1000;
    }

    public long getMillimetersFromKilometers(long millimeters) {
        return millimeters * 1000000;
    }
}
