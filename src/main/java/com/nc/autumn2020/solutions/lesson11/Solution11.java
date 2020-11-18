package com.nc.autumn2020.solutions.lesson11;

import com.nc.autumn2020.LessonApi;

import java.util.Scanner;

public class Solution11 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] days = scanner.nextLine().toUpperCase().split(" ");
            DaysOfTheWeek day = DaysOfTheWeek.MONDAY;
            try {
                for (String s : days) {
                    if (DaysOfTheWeek.valueOf(s).compareTo(day) > 0) {
                        day = DaysOfTheWeek.valueOf(s);
                    }
                }
            } catch (IllegalArgumentException exception) {
                //exception.printStackTrace();
                System.out.println("Такого названия нет! " + exception.getMessage());
                break;
            }

            System.out.println(day.getCitation());
        }
    }
}
