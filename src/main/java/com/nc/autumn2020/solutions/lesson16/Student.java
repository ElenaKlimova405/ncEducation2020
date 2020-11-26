package com.nc.autumn2020.solutions.lesson16;

import org.jetbrains.annotations.NotNull;

import java.util.Queue;
import java.util.Random;

public class Student extends Human implements Comparable{
    HomeWork homeWork;

    public Student(String firstName, String secondName, String lasttName, HomeWork homeWork) {
        super(firstName, secondName, lasttName);
        this.homeWork = homeWork;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            this.homeWork.addHomeWork(this);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Студент " + this + " закончил добавлять д/з.");
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return this.toString().compareTo(o.toString());
    }
}
