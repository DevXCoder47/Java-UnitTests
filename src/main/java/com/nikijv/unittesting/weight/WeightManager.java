package com.nikijv.unittesting.weight;

public class WeightManager {
    public long getMilligramsFromGrams(long grams) {
        return grams * 1000;
    }

    public long getMilligramsFromKiloGrams(long kilograms) {
        return kilograms * 1000000;
    }

    public long getMilligramsFromCentners(long centners) {
        return centners * 100000000;
    }

    public long getMilligramsFromTons(long tons) {
        return tons * 1000000000;
    }
}
