package com.nc.autumn2020.solutions.lesson16;

import java.util.Queue;
import java.util.Random;

public class Teacher extends Human{
    HomeWork homeWork;
    /*private static volatile Integer countOfHomeWork = 15;
    private static volatile Integer check = 0;*/

    public Teacher(String firstName, String secondName, String lastName, HomeWork homeWork) {
        super(firstName, secondName, lastName);
        this.homeWork = homeWork;
    }

    @Override
    public synchronized void run() {
        int flag = 1;
        while (flag == 1) {
            flag = this.homeWork.getHomeWork(this);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Учитель " + this + " закончил проверять.");
    }
}
