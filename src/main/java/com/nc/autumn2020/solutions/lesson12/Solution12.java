package com.nc.autumn2020.solutions.lesson12;

import com.nc.autumn2020.LessonApi;

public class Solution12 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        DataBase dataBase = DataBaseFactory.newInstance();

        System.out.println("Добавили объект: " + dataBase.getCustomObject());
    }
}
