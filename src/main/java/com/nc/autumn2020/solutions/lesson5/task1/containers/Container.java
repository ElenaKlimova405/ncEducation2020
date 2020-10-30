package com.nc.autumn2020.solutions.lesson5.task1.containers;

import com.nc.autumn2020.solutions.lesson5.task1.fruits.Fruit;

public abstract class Container {
    private final int totalFruitWeight;
    private final int containerCapacity;

    private Fruit[] fruits;
    private int currentFruitWeight = 0;
    private int currentFruitCount = 0;

    /**
     *
     * @param totalFruitWeight - вместимость контейнера в граммах
     * @param containerCapacity - вместимость контейнера в количестве фруктов
     */
    protected Container(int totalFruitWeight, int containerCapacity) {
        if (containerCapacity <= 0)
            throw new IllegalArgumentException("Вместимость контейнера должна быть положительной!");
        if (totalFruitWeight <= 0)
            throw new IllegalArgumentException("Общий вес фруктов должен быть положительным!");

        this.totalFruitWeight = totalFruitWeight;
        this.containerCapacity = containerCapacity;
        this.fruits = new Fruit[containerCapacity];
    }

    public boolean putFruit(Fruit fruit) {
        if (this.currentFruitCount + 1 <= this.containerCapacity &&
                this.currentFruitWeight + fruit.getWeight() <= this.totalFruitWeight) {
            this.fruits[this.currentFruitCount] = fruit;
            this.currentFruitCount++;
            this.currentFruitWeight += fruit.getWeight();
            return true;
        }
        return false;
    }

    public Fruit takeFruit() {
        if (this.currentFruitCount > 0) {
            Fruit fruit = this.fruits[this.currentFruitCount - 1];
            this.currentFruitCount--;
            this.currentFruitWeight -= fruit.getWeight();
            return fruit;
        }
        return null;
    }

    public int getCurrentFruitWeight() {
        return currentFruitWeight;
    }

    public int getCurrentFruitCount() {
        return currentFruitCount;
    }
}
