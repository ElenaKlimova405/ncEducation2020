package com.nc.autumn2020.solutions.lesson12;

import com.nc.autumn2020.LessonApi;

public class Annotations implements LessonApi {
    /**
     *  1. Аннотация на уровне компиляции
     *  2. Уровень Class но не попадают в RunTime
     *  3. Runtime
     *
     *
     * @param args
     */
    @Override
    public void executeSolution(String[] args) {


        DataBase dataBase = DataBaseFactory.newInstance();
        System.out.println(dataBase);


    }


}







/**
 * Override - переопределенный метод
 * Deprecated - устаревшый метод, не рекомендуемый к использованию
 * SafeVarargs безопасные аргументы (для подавления варнингов на этапе компилляции)
 * Retention – сюда можно указать, до какого момента живет аннотация
 * Target - сюда можно указать, куда можно применять аннотацию (например, на конструктор, на поля...)
 */