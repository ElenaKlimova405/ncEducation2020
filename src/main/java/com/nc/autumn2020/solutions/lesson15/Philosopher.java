package com.nc.autumn2020.solutions.lesson15;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable{
    private String name;
    private Semaphore table;

    public Philosopher(String name, Semaphore table) {
        this.name = name;
        this.table = table;
    }

    @Override
    public void run() {
        try {
            table.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.name + ": Я сейчас буду есть.");

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(this.name + ": *Звуки поедания блюд*.");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.name + ": Я поел.");

        table.release();
    }
}
