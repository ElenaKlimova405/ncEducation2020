package com.nc.autumn2020.lessons.lesson13;

import com.nc.autumn2020.LessonApi;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LessonClass implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> arrayList2 = arrayList.subList(1, 2);
        arrayList2.set(0, 99);

        Field field = null;
        try {
            field = ArrayList.class.getDeclaredField("elementData");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        field.setAccessible(true);
        try {
            System.out.println(Arrays.asList( (Object[]) field.get(arrayList)));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
