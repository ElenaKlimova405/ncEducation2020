package com.nc.autumn2020.solutions.lesson5.task3.animals;

import com.nc.autumn2020.solutions.lesson5.task3.Food;

public class Rabbit extends Animal{
    public Rabbit(int countOfFood) {
        super(countOfFood);
    }

    @Override
    public void say() {
        System.out.println("*Красноречивое молчание*");
    }

    @Override
    public Food eat(Food food) {
        if (this.isHungry()) {
            this.incrementCurrentCountOfFood();
            System.out.println("Хрум");
            return null;
        }
        return food;
    }
}
