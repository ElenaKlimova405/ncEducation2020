package com.nc.autumn2020.solutions.lesson5.task1;

import com.nc.autumn2020.solutions.lesson5.task1.containers.FruitBasket;
import com.nc.autumn2020.solutions.lesson5.task1.containers.PlasticContainer;
import com.nc.autumn2020.solutions.lesson5.task1.fruits.Apple;
import com.nc.autumn2020.solutions.lesson5.task1.fruits.Fruit;
import com.nc.autumn2020.solutions.lesson5.task1.fruits.Mandarin;
import com.nc.autumn2020.solutions.lesson5.task1.fruits.Pear;

import java.util.Random;

// метод класса запускается в Main
public class Solution5_1 {
    public void run(String[] args) {
        Human human = new Human();
        FruitBasket fruitBasket = new FruitBasket();
        PlasticContainer plasticContainer = new PlasticContainer();

        Apple apple1 = new Apple(92, 176);
        Apple apple2 = new Apple(95, 181);
        Apple apple3 = new Apple(86, 166);
        Apple apple4 = new Apple(81, 152);
        Apple apple5 = new Apple(99, 190);
        Apple apple6 = new Apple(75, 130);
        Apple apple7 = new Apple(95, 181);
        Apple apple8 = new Apple(91, 180);
        Apple apple9 = new Apple(86, 158);
        Apple apple10 = new Apple(79, 139);

        Pear pear1 = new Pear(93, 180);
        Pear pear2 = new Pear(70, 140);
        Pear pear3 = new Pear(69, 136);
        Pear pear4 = new Pear(89, 178);
        Pear pear5 = new Pear(83, 155);
        Pear pear6 = new Pear(77, 147);
        Pear pear7 = new Pear(87, 159);
        Pear pear8 = new Pear(80, 169);
        Pear pear9 = new Pear(73, 145);
        Pear pear10 = new Pear(70, 138);

        Mandarin mandarin1 = new Mandarin(43, 130);
        Mandarin mandarin2 = new Mandarin(48, 140);
        Mandarin mandarin3 = new Mandarin(45, 137);
        Mandarin mandarin4 = new Mandarin(44, 135);
        Mandarin mandarin5 = new Mandarin(43, 131);
        Mandarin mandarin6 = new Mandarin(44, 136);
        Mandarin mandarin7 = new Mandarin(47, 139);
        Mandarin mandarin8 = new Mandarin(43, 131);
        Mandarin mandarin9 = new Mandarin(43, 132);
        Mandarin mandarin10 = new Mandarin(46, 138);

        Fruit[] fruits = new Fruit[] {apple1, apple2, apple3, apple4, apple5, apple6, apple7, apple8, apple9, apple10,
                pear1, pear2, pear3, pear4, pear5, pear6, pear7, pear8, pear9, pear10,
                mandarin1, mandarin2, mandarin3, mandarin4, mandarin5, mandarin6, mandarin7, mandarin8, mandarin9, mandarin10};

        Random r = new Random();
        int rmod;
        for (Fruit fruit:
                fruits) {
            rmod = r.nextInt(2);
            if (rmod == 0) {
                if (fruitBasket.putFruit(fruit)) {
                    System.out.println("Положен фрукт " + fruit.getName() + " весом " + fruit.getWeight()
                            + " грамм в корзину");
                }
                else {
                    System.out.println("Нельзя положить фрукт " + fruit.getName() + " весом " + fruit.getWeight()
                            + " грамм в корзину");
                }
            }
            else {
                if (plasticContainer.putFruit(fruit)) {
                    System.out.println("Положен фрукт " + fruit.getName() + " весом " + fruit.getWeight()
                            + " грамм в пластиковый контейнер");
                }
                else {
                    System.out.println("Нельзя положить фрукт " + fruit.getName() + " весом " + fruit.getWeight()
                            + " грамм в пластиковый контейнер");
                }
            }

            System.out.println("В корзине " + fruitBasket.getCurrentFruitCount() +
                    " фруктов общим весом " + fruitBasket.getCurrentFruitWeight() + " грамм");
            System.out.println("В пластиковом контейнере " + plasticContainer.getCurrentFruitCount() +
                    " фруктов общим весом " + plasticContainer.getCurrentFruitWeight() + " грамм");
        }



        Fruit fruit;
        int sumOfCalories = 0;
        for (int i = 0; i < 5; i++) {
            rmod = r.nextInt(2);
            if (rmod == 0) {
                fruit = fruitBasket.takeFruit();
                if (fruit == null) {
                    System.out.println("В корзине нет фруктов!");
                }
                else {
                    System.out.println("Саймон взял фрукт из корзины");
                }
            }
            else {
                fruit = plasticContainer.takeFruit();
                if (fruit == null) {
                    System.out.println("В пластиковом контейнере нет фруктов!");
                }
                else {
                    System.out.println("Саймон взял фрукт из пластикового контейнера");
                }
            }

            human.eats(fruit);
            sumOfCalories += fruit.getCalories();
        }

        System.out.println("Всего " + sumOfCalories + " Ккал");

        System.out.println("В корзине осталось " + fruitBasket.getCurrentFruitCount() +
                " фруктов общим весом " + fruitBasket.getCurrentFruitWeight() + " грамм");
        System.out.println("В пластиковом контейнере осталось " + plasticContainer.getCurrentFruitCount() +
                " фруктов общим весом " + plasticContainer.getCurrentFruitWeight() + " грамм");
    }
}
