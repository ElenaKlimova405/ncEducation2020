package com.nc.autumn2020.lesson5;

public class Rectangle extends Figure{
    private final int a, b;

    public Rectangle(int a, int b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("Стороны должны иметь положительные значения!");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return a + a + b + b;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}
