package com.nc.autumn2020.lesson5;

public class Circle extends Figure{

    private final int r;

    public Circle(int r) {
        if (r <= 0)
            throw new IllegalArgumentException("Радиус должен иметь положительное значение!");
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
