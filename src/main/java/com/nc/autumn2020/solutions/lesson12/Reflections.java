package com.nc.autumn2020.solutions.lesson12;

import com.nc.autumn2020.LessonApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Интроспекция - исследование класса поля, модификаторы
 * Использование - вызов методов
 * Изменения на лету - добавление новых полей и методов и интерфейсов в Java запрещено в силу безопасности
 */
public class Reflections implements LessonApi {
    @Override
    public void executeSolution(String[] args) {


        List<Object> voices = new ArrayList<>();
        while (true) {
            System.out.println("1 Добавить животное\n" +
                    "2 Пройтись по зоопарку\n" +
                    "3 Выход");
            Scanner scanner = new Scanner(System.in);

            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    newAnimal(voices);
                    break;
                case 2:
                    walk(voices);break;
                case 3: {
                    scanner.close();
                    System.exit(0);
                }
                default:System.exit(0);
            }
        }
    }

    private void newAnimal(List<Object> voices) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            Class aClass = Class.forName("com.nc.autumn2020.lesson12."+name);
            Object animal = aClass.newInstance();
            voices.add(animal);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void walk(List<Object> voices) {
        for (Object voice : voices) {
            Class<?> aClass = voice.getClass();
            try {
                Method makeVoice = aClass.getDeclaredMethod("makeVoice");
                makeVoice.setAccessible(true);
                makeVoice.invoke(voice);
                makeVoice.setAccessible(false);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}

interface Voice {
    void makeVoice();
}
class A {
    private String name;
    public String secondName;
    protected String thirdName;

    public String getName() {
        return name;
    }

    public void find(){
        System.out.println("find");
    }

    String fourthName;

    public   A() {
    }

    public A(String name) {
        this.name = name;
    }

    private static synchronized void doSome() {

    }
}
class Monkey implements Voice {
    @Override
    public void makeVoice() {
        System.out.println("uu aaa");
    }
}
class Zebra implements Voice {

    @Override
    public void makeVoice() {
        System.out.println("gogogogo");
    }

}
class Begemot  {
    public void makeVoice() {
        System.out.println("bulbul");
    }

}

