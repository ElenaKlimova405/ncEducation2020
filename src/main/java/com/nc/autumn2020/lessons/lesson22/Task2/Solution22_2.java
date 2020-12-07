package com.nc.autumn2020.lessons.lesson22.Task2;

import com.nc.autumn2020.LessonApi;
import com.nc.autumn2020.lessons.lesson22.Task1.AudioPlayer;
import com.nc.autumn2020.lessons.lesson22.Task1.EuropaPlus;
import com.nc.autumn2020.lessons.lesson22.Task1.LoveRadio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution22_2 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config_solution22_2.xml");

        Field field = (Field) applicationContext.getBean("F");
        //Worker worker = (Worker) applicationContext.getBean("com.nc.autumn2020.lessons.lesson22.Task2.Worker");

        field.addWorker((Worker) applicationContext.getBean("W"));
        field.addWorker((Worker) applicationContext.getBean("W"));
        field.addWorker((Worker) applicationContext.getBean("W"));
        field.addWorker((Worker) applicationContext.getBean("W"));

        System.out.println("День 1.");
        field.bePlowed();

        field.removeOneWorker();
        field.removeOneWorker();

        System.out.println("День 2.");
        field.bePlowed();

        field.addWorker((Worker) applicationContext.getBean("W"));

        System.out.println("День 3.");
        field.bePlowed();

        System.out.println("День 4.");
        field.bePlowed();


        applicationContext.close();
    }
}
/*
Задача:
Есть бин поле, у него параметр: "процент вспаханности" и параметр рабочие, которые на нём работают
Есть бин рабочий (scope Prototype)

Необходимо сделать функциональность которая позволяет добавлять и удалять рабочих с поля

 */