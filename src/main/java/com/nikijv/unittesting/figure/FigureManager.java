package com.nikijv.unittesting.figure;

public class FigureManager {
    public double getTriangleArea(double a, double h) {
        return 0.5 * a * h;
    }

    public double getSquareArea(double a) {
        return Math.pow(a, 2);
    }

    public double getRectangleArea(double a, double b) {
        return a * b;
    }

    public double getRhombusArea(double d1, double d2) {
        return 0.5 * d1 * d2;
    }
}
