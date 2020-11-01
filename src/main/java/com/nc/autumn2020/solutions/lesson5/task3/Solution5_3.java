package com.nc.autumn2020.solutions.lesson5.task3;

import com.nc.autumn2020.LessonApi;

public class Solution5_3 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {

        System.out.println("Проверка 1:");

        SmartFarm smartFarm = new SmartFarm(5, 12,3, 100);

        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.rabbit);

        smartFarm.cow.wakeUp();
        smartFarm.rabbit.wakeUp();
        smartFarm.hen.wakeUp();

        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.rabbit);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.rabbit);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.rabbit);
        smartFarm.feed(smartFarm.rabbit);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.cow);

        smartFarm.putToSleep(smartFarm.cow);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.rabbit);
        smartFarm.putToSleep(smartFarm.rabbit);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.rabbit);
        smartFarm.putToSleep(smartFarm.hen);
        smartFarm.feed(smartFarm.cow);
        smartFarm.feed(smartFarm.hen);
        smartFarm.feed(smartFarm.rabbit);





        // умные функции:

        System.out.println("Проверка 2:");

        smartFarm.setTime(8);
        smartFarm.setTime(15);
        smartFarm.setTime(19);
        smartFarm.setTime(20);
        smartFarm.setTime(23);

        smartFarm.setTime(6);
        smartFarm.setTime(7);
        smartFarm.setTime(12);
        smartFarm.setTime(18);
        smartFarm.setTime(19);
        smartFarm.setTime(20);
        smartFarm.setTime(22);
        smartFarm.setTime(23);

        smartFarm.setTime(4);
        smartFarm.setTime(6);
        smartFarm.setTime(7);
        smartFarm.setTime(9);
        smartFarm.setTime(13);
        smartFarm.setTime(18);
        smartFarm.setTime(19);
        smartFarm.setTime(20);
        smartFarm.setTime(23);

    }
}
