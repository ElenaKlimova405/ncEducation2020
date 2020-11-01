package com.nc.autumn2020.solutions.lesson5.task3.animals;

import com.nc.autumn2020.solutions.lesson5.task3.Food;

public abstract class Animal {
    private final int countOfFood; // сколько еды животное хочет кушать
    private int currentCountOfFood;
    private boolean isSleeping = true;

    protected Animal(int countOfFood) {
        this.countOfFood = countOfFood;
    }

    public void incrementCurrentCountOfFood() {
        currentCountOfFood++;
    }

    public int getCurrentCountOfFood() {
        return currentCountOfFood;
    }

    public int getCountOfFood() {
        return countOfFood;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public boolean isHungry() {
        return (currentCountOfFood < countOfFood);
    }

    public abstract void say();

    public abstract Food eat(Food food);

    public void sleep() {
        this.isSleeping = true;
    }

    public void wakeUp() {
        if (this.isSleeping) {
            this.isSleeping = false;
            this.currentCountOfFood = 0;
            this.say();
        }
    }
}
