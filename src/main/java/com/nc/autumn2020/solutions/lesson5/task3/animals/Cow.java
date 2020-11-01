package com.nc.autumn2020.solutions.lesson5.task3.animals;

import com.nc.autumn2020.solutions.lesson5.task3.Food;

public class Cow extends Animal{
    public Cow(int countOfFood) {
        super(countOfFood);
    }

    @Override
    public void say() {
        System.out.println("Му-у-у");
    }

    @Override
    public Food eat(Food food) {
        if (this.isHungry()) {
            this.incrementCurrentCountOfFood();
            System.out.println("Чавк");
            return null;
        }
        return food;
    }
}
