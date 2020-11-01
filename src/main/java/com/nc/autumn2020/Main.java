package com.nc.autumn2020;

import java.io.IOException;

import com.nc.autumn2020.lesson6.StringLesson;
import com.nc.autumn2020.lesson6.SystemPropertyInfo;
import com.nc.autumn2020.solutions.additional.Solution3;
import com.nc.autumn2020.solutions.lesson5.task1.Solution5_1;
import com.nc.autumn2020.solutions.lesson5.task3.Solution5_3;

public class Main {
    public static void main(String[] args) throws IOException {

        //new Solution5_1().run(args);

        //new SystemPropertyInfo().executeSolution(args);

        LessonApi lessonApi = new Solution5_3();
        lessonApi.executeSolution(args);
    }
}
