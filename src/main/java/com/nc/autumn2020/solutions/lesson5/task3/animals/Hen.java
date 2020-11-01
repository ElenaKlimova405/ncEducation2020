package com.nc.autumn2020.solutions.lesson5.task3.animals;

import com.nc.autumn2020.solutions.lesson5.task3.Food;

public class Hen extends Animal{
    public Hen(int countOfFood) {
        super(countOfFood);
    }

    @Override
    public void say() {
        System.out.println("Ко-ко-ко");
    }

    @Override
    public Food eat(Food food) {
        if (this.isHungry()) {
            this.incrementCurrentCountOfFood();
            System.out.println("Звяк");
            return null;
        }
        return food;
    }
}
