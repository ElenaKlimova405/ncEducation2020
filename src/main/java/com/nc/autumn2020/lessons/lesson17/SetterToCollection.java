package com.nc.autumn2020.lessons.lesson17;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class SetterToCollection implements Runnable {
    private Semaphore semaphoreForList;
    private ArrayList<Integer> list;

    public SetterToCollection(Semaphore semaphoreForList, ArrayList<Integer> list) {
        this.semaphoreForList = semaphoreForList;
        this.list = list;
    }

    public synchronized void setElement() {
        try {
            Random random = new Random();
            Integer integer = random.nextInt() % 100;
            semaphoreForList.acquire();
            list.add(integer);
            System.out.println("Добавлено число: " + integer);
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.notifyAll();
            semaphoreForList.release();
        }

    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            setElement();
            try {
                if (!Thread.interrupted())
                    Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
