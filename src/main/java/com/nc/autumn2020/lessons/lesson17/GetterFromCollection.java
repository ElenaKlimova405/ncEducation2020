package com.nc.autumn2020.lessons.lesson17;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class GetterFromCollection implements Runnable {
    private Semaphore semaphoreForList;
    private ArrayList<Integer> list;

    public GetterFromCollection(Semaphore semaphoreForList, ArrayList<Integer> list) {
        this.semaphoreForList = semaphoreForList;
        this.list = list;
    }

    public synchronized void getAndPrint() {
        try {
            semaphoreForList.acquire();

            while (list.size() == 0) {
                this.wait();
            }

            System.out.println("Печатаю числа: ");
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println("\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            semaphoreForList.release();
        }
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            getAndPrint();
            try {
                if (!Thread.interrupted())
                    Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
