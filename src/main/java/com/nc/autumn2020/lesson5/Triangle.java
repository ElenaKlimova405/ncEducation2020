package com.nc.autumn2020.lesson5;

public class Triangle extends Figure implements Drawable{
    private final int a, b, c;

    public Triangle(int a, int b, int c) {
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
