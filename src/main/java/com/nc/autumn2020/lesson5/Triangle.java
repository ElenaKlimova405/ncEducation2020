package com.nc.autumn2020.lesson5;

public class Triangle extends Figure{
    private final int a, b, c;

    public Triangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Стороны должны иметь положительные значения!");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public double area() {
        double p;
        p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p-a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }
}
