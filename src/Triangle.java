/*
 * Created on 2025-04-02
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public void draw() {
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
    }
}
