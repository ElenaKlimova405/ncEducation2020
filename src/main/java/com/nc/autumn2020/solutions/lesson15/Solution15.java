package com.nc.autumn2020.solutions.lesson15;

import com.nc.autumn2020.LessonApi;

import java.util.concurrent.Semaphore;

public class Solution15 implements LessonApi {

    @Override
    public void executeSolution(String[] args) {
        Semaphore table = new Semaphore(3);

        for (int i = 1; i <= 7; i++) {
            new Thread(new Philosopher("Философ"+i, table)).start();
        }

    }
}
