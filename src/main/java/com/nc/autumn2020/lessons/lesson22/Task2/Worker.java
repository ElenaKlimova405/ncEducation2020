package com.nc.autumn2020.lessons.lesson22.Task2;

import java.util.Random;

public class Worker {
    private int amountOfWork;

    public Worker(int amountOfWorkUpperBound) {
        this.amountOfWork = new Random().nextInt(amountOfWorkUpperBound) + 1;
    }

    public int getAmountOfWork() {
        return amountOfWork;
    }
}
