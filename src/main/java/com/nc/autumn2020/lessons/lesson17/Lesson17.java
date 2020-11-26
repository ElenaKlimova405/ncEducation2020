package com.nc.autumn2020.lessons.lesson17;

import com.nc.autumn2020.LessonApi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Lesson17 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        Semaphore semaphoreForList = new Semaphore(1);
        List<Integer> list = new ArrayList<Integer>();


        Thread threadGetter = new Thread(new GetterFromCollection(semaphoreForList, (ArrayList<Integer>) list));
        Thread threadSetter = new Thread(new SetterToCollection(semaphoreForList, (ArrayList<Integer>) list));

        threadGetter.start();
        threadSetter.start();

        try {
            if (!Thread.interrupted())
                Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        threadGetter.interrupt();
        threadSetter.interrupt();

        try {
            threadGetter.join();
            threadSetter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
