package com.nc.autumn2020.lesson5;

public class Square extends Rectangle{
    public Square(int a) {
        super(a, a);
    }

    @Override
    public double area() {
        return (double)(super.getA() * super.getA());
    }

    @Override
    public double perimeter() {
        return (double)(4*super.getA());
    }

    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
}
