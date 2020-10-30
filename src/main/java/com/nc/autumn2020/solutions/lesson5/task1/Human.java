package com.nc.autumn2020.solutions.lesson5.task1;

import com.nc.autumn2020.solutions.lesson5.task1.fruits.Fruit;

public class Human {
    public void eats(Fruit fruit) {
        if (fruit != null) {
            System.out.println("Саймон говорит: \"" + fruit.eat() + '\"');
        } else {
            System.out.println("\"Саймон говорит: \"Фрукта нет!\"");

        }
    }
}
