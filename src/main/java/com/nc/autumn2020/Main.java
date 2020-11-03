package com.nc.autumn2020;

import java.io.IOException;

import com.nc.autumn2020.lessons.lesson6.StringLesson;
import com.nc.autumn2020.solutions.lesson5.task3.Solution5_3;
import com.nc.autumn2020.solutions.lesson6.task1_url_holder.ClassForUrlHolder;

public class Main {
    public static void main(String[] args) throws IOException {

        //new Solution5_1().run(args);

        //new SystemPropertyInfo().executeSolution(args);

        /*LessonApi lessonApi = new Solution5_3();
        lessonApi.executeSolution(args);*/

        /*LessonApi lessonApi = new StringLesson();
        lessonApi.executeSolution(args);*/

        LessonApi lessonApi = new ClassForUrlHolder();
        lessonApi.executeSolution(args);


    }
}
