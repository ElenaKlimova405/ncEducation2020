package com.nc.autumn2020.lessons.lesson11;

import com.nc.autumn2020.LessonApi;
import com.nc.autumn2020.lessons.lesson5.Figure;
import com.nc.autumn2020.lessons.lesson5.Rectangle;

public class Solution11 implements LessonApi {

    @Override
    public void executeSolution(String[] args) {


        Basket<Figure> basket = new Basket<>();

        basket.setItem(new Rectangle(1, 2));

        Figure item = basket.getItem();

        // System.out.println(item);

        Basket<?> basket1 = basket;
       // basket1.setItem(new Rectangle(2, 3));

        Object item1 = basket1.getItem();






    }
}
