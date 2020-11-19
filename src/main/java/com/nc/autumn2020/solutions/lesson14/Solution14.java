package com.nc.autumn2020.solutions.lesson14;

import com.nc.autumn2020.LessonApi;

import java.util.Arrays;
import java.util.Optional;

public class Solution14 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        Integer[][] integers = new Integer[][] {
                {1, 2, 4, 7, 5},
                {9, 4, 0, 1, 5, 3, 2, 6, 8}
        };



        Integer sum = Arrays.stream(integers)
                .flatMap(i -> Arrays.stream(i))
                .filter(i -> (i % 2 == 0))
                .reduce((a, b) -> (a + b))
                .orElse(0);
        System.out.println("Сумма равна " + sum);


    }
}
