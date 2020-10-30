package com.nc.autumn2020.solutions.lesson5.task1.fruits;

public abstract class Fruit {
    private String name;
    private final int calories;
    private final int weight;

    /**
     *
     * @param calorieContent - калорийность фарукта
     * @param weight - вес в граммах
     */
    protected Fruit(int calorieContent, int weight) {
        if (calorieContent <= 0)
            throw new IllegalArgumentException("Калорийность фрукта должна быть положительной!");
        if (weight <= 0)
            throw new IllegalArgumentException("Вес фрукта должна быть положительной!");

        this.calories = calorieContent;
        this.weight = weight;
    }

    protected void setName(String name) {
        if (name.length() == 0)
            throw new IllegalArgumentException("Длина названия фрукта должно быть ненулевой!");
        this.name = String.valueOf(name);
    }

    public String getName() {
        return String.valueOf(this.name);
    }

    public int getCalories() {
        return this.calories;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString( ) {
        return "фрукт " + name +
                " калорийностью " + calories;
    }
}
