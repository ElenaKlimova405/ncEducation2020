package com.nc.autumn2020;

import com.nc.autumn2020.lessons.lesson13.LessonClass;
import com.nc.autumn2020.lessons.lesson14.ClassForLesson14;
import com.nc.autumn2020.solutions.lesson11.Solution11;
import com.nc.autumn2020.solutions.lesson12.Reflections;
import com.nc.autumn2020.solutions.lesson12.Solution12;
import com.nc.autumn2020.solutions.lesson14.Solution14;

import java.io.IOException;



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
        /*LessonApi lessonApi = new Solution8();
        lessonApi.executeSolution(args);
        */

        // lesson 9
       /* LessonApi lessonApi = new IOSoluttions();
        lessonApi.executeSolution(args);*/


        // lesson 10
        /*LessonApi lessonApi = new GenericClass();
        lessonApi.executeSolution(args);*/


        // lesson 11
        /*LessonApi lessonApi = new Solution11();
        lessonApi.executeSolution(args);*/


        // solution 11
       /* LessonApi lessonApi = new Solution11();
        lessonApi.executeSolution(args);*/

        // solution 12
       /* LessonApi lessonApi = new Solution12();
        lessonApi.executeSolution(args);*/


        // рефлексия
       /* LessonApi lessonApi = new Reflections();
        lessonApi.executeSolution(args);*/


        // solution 13
       /*LessonApi lessonApi = new LessonClass();
        lessonApi.executeSolution(args);*/

        // lesson 14
        /*LessonApi lessonApi = new ClassForLesson14();
        lessonApi.executeSolution(args);*/


        // solution 14
        LessonApi lessonApi = new Solution14();
        lessonApi.executeSolution(args);


    }
}
