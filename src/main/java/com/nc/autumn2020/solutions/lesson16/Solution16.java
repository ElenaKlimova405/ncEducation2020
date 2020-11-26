package com.nc.autumn2020.solutions.lesson16;

import com.nc.autumn2020.LessonApi;

import java.util.*;
import java.util.concurrent.Semaphore;

public class Solution16 implements LessonApi {

    @Override
    public void executeSolution(String[] args) {

        HomeWork homeWork = new HomeWork();

        Teacher teacher1 = new Teacher("teacherName1", "teacherSecondName1",
                "teacherLastName1", homeWork);
        Teacher teacher2 = new Teacher("teacherName2", "teacherSecondName2",
                "teacherLastName2", homeWork);

        Student student1 = new Student("studentName1", "studentSecondName1",
                "studentLastName1", homeWork);
        Student student2 = new Student("studentName2", "studentSecondName2",
                "studentLastName2", homeWork);
        Student student3 = new Student("studentName3", "studentSecondName3",
                "studentLastName3", homeWork);
        Student student4 = new Student("studentName4", "studentSecondName4",
                "studentLastName4", homeWork);
        Student student5 = new Student("studentName5", "studentSecondName5",
                "studentLastName5", homeWork);


        Thread threadT1 = new Thread(teacher1);
        Thread threadT2 = new Thread(teacher2);

        Thread threadS1 = new Thread(student1);
        Thread threadS2 = new Thread(student2);
        Thread threadS3 = new Thread(student3);
        Thread threadS4 = new Thread(student4);
        Thread threadS5 = new Thread(student5);


        threadT1.start();
        threadT2.start();
        threadS1.start();
        threadS2.start();
        threadS3.start();
        threadS4.start();
        threadS5.start();


        try {
            threadT1.join();
            threadT2.join();
            threadS1.join();
            threadS2.join();
            threadS3.join();
            threadS4.join();
            threadS5.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        Map<Student, ArrayList<Grade>> journal = homeWork.getJournal();
        System.out.println("ЗАПОЛНЕННЫЙ ЖУРНАЛ: ");

        Set<Map.Entry<Student, ArrayList<Grade>>> entries = journal.entrySet();
        for (Map.Entry<Student, ArrayList<Grade>> entry : entries) {
            System.out.print("ФИО: " + entry.getKey() + "\nОЦЕНКИ: ");
            for (Grade grade : entry.getValue()) {
                System.out.print(grade.getGrade() + " ");
            }
            System.out.println();
        }
    }
}
