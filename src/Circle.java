/*
 * Created on 2025-04-02
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void draw() {
        System.out.println("  ****  ");
        System.out.println(" *    * ");
        System.out.println("*      *");
        System.out.println(" *    * ");
        System.out.println("  ****  ");
    }
}