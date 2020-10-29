package com.nc.autumn2020.lesson5;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){

        Square square = new Square(2);
        Triangle triangle = new Triangle(2,4,4);
        Circle circle = new Circle(4);

        Figure[] figures = new Figure[] {square, triangle, circle};

        double sumOfArea = 0, sumOfPerimeter = 0;
        for (int i= 0; i < 3; i++) {
            sumOfArea += figures[i].area();
            sumOfPerimeter += figures[i].perimeter();
        }

        System.out.println("sumOfArea == " + sumOfArea);
        System.out.println("sumOfPerimeter == " + sumOfPerimeter);
    }
}
