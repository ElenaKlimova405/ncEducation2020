package com.nc.autumn2020.solutions.lesson8;

import com.nc.autumn2020.LessonApi;

public class Solution8 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        try (RandomProvider randomProvider = new RandomProvider(10);) {
            for (int i = 0; i < 11; i++) {
                System.out.println(randomProvider.next());
            }
        }
       catch (Exception e) {
           System.out.println("Поймано исключение!");
           e.printStackTrace();
        }
    }
}
