package com.nc.autumn2020.solutions.lesson5.task3;

import com.nc.autumn2020.solutions.lesson5.task3.animals.*;

public class SmartFarm {
    public Rabbit rabbit;
    public Cow cow;
    public Hen hen;
    private Food[] foodStorage;
    private int currentCountOfFoodInFoodStorage;

    public SmartFarm(int countOfFoodForRabbit, int countOfFoodForCow, int countOfFoodForHen, int countOfFoodInFoodStorage) {
        if (countOfFoodForRabbit <= 0)
            throw new IllegalArgumentException("Количество еды для кролика должно быть положительным!");
        if (countOfFoodForCow <= 0)
            throw new IllegalArgumentException("Количество еды для коровы должно быть положительным!");
        if (countOfFoodForHen <= 0)
            throw new IllegalArgumentException("Количество еды для курицы должно быть положительным!");
        if (countOfFoodInFoodStorage <= 0)
            throw new IllegalArgumentException("Количество еды в хранилище еды должно быть положительным!");
        this.rabbit = new Rabbit(countOfFoodForRabbit);
        this.cow = new Cow(countOfFoodForCow);
        this.hen = new Hen(countOfFoodForHen);
        this.foodStorage = new Food[countOfFoodInFoodStorage];
        currentCountOfFoodInFoodStorage = countOfFoodInFoodStorage;
        for (int i = 0; i < countOfFoodInFoodStorage; i++) {
            this.foodStorage[i] = new Food();
        }
    }

    public void putToSleep(Animal animal) {
        if (animal.isHungry()) {
            animal.say();
            if (!this.feed(animal)) return;
        }

        animal.sleep();
    }

    public boolean feed(Animal animal) {
        if (animal.isSleeping()) {
            animal.say();
            return true;
        }

        while (true) {
            if (this.currentCountOfFoodInFoodStorage > 0) {
                if (animal.eat(this.foodStorage[(this.currentCountOfFoodInFoodStorage--) - 1]) != null) {
                    return true;
                }
            } else {
                System.out.println("Нужно больше еды");
                return false;
            }
        }

    }

    public void setTime(int currentHour) {
        if (currentHour < 0 || currentHour > 23)
            throw new IllegalArgumentException("Неправильно введен час!");

        System.out.print("Сейчас " + currentHour + " часов. ");

        if (currentHour >= 8 && currentHour <= 19) {
            System.out.println("Кто хочет кушать?");
            this.rabbit.wakeUp();
            this.cow.wakeUp();
            this.hen.wakeUp();
            if (!this.feed(this.rabbit)) return;
            if (!this.feed(this.cow)) return;
            if (!this.feed(this.hen)) return;
        } else {
            System.out.println("Все должны спать!");
            this.putToSleep(this.rabbit);
            this.putToSleep(this.cow);
            this.putToSleep(this.hen);
        }
    }

}
