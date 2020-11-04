package com.nc.autumn2020;

import java.io.IOException;

import com.nc.autumn2020.lessons.lesson6.StringLesson;
import com.nc.autumn2020.lessons.lesson8.ClassForLesson8;
import com.nc.autumn2020.solutions.lesson5.task3.Solution5_3;
import com.nc.autumn2020.solutions.lesson6.task1_url_holder.ClassForUrlHolder;
import com.nc.autumn2020.solutions.lesson6.task2_plugin.DynamicClassLoaderExample;
import com.nc.autumn2020.solutions.lesson8.Solution8;

public class Main {
    public static void main(String[] args) throws IOException {

        //new Solution5_1().run(args);

        //new SystemPropertyInfo().executeSolution(args);

        /*LessonApi lessonApi = new Solution5_3();
        lessonApi.executeSolution(args);*/

        /*LessonApi lessonApi = new StringLesson();
        lessonApi.executeSolution(args);*/


        // lesson 6 task 1 (url)
       /* LessonApi lessonApi = new ClassForUrlHolder();
        lessonApi.executeSolution(args);*/

        // lesson 6 task 2 (plugin)
        /*LessonApi lessonApi = new DynamicClassLoaderExample();
        lessonApi.executeSolution(args);*/


        // lesson 8
        LessonApi lessonApi = new Solution8();
        lessonApi.executeSolution(args);


    }
}
