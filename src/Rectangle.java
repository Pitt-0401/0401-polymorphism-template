/*
 * Created on 2025-04-02
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
    
    @Override
    public void draw() {
        System.out.println("********");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("********");
    }
}