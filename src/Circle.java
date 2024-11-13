/*
 * Created on 2024-11-13
 *
 * Copyright (c) 2024 Nadine von Frankenberg
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