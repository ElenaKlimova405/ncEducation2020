package com.nc.autumn2020.lessons.lesson8;

import com.nc.autumn2020.LessonApi;

import java.lang.reflect.Method;

public class ClassForLesson8 implements LessonApi {

    @Override
    public void executeSolution(String[] args) {
        Role role = new Role();
        Class<? extends Role> clazz = role.getClass();
        Class<Role> roleClass = Role.class;

        System.out.println(clazz);
        System.out.println(roleClass);
        System.out.println(clazz == roleClass);

        System.out.println(clazz.getName());

        System.out.println("---------");
        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            System.out.println(declaredMethod.getName());
        }


        System.out.println("*****************");


        System.out.println(role instanceof Role);
        System.out.println(role instanceof Object);

        System.out.println("--------------");



        Role[] roles1 = new Role[]{new Role("name1", "authority2"),
                new Role("name2", "authority4"),
                new Role("name3", "authority7")};
        User user = new User(4, "username1", "passwd", roles1);

        System.out.println(role);
        System.out.println(user);


        System.out.println("--------------");

        Number number = new Number(10);
        Number number1 = new Number(340000);
        Integer integer = 10;
        System.out.println(number.hashCode());
        //System.out.println(integer.hashCode());
        System.out.println(number1.hashCode());

        System.out.println("*****************");

        //Complex complex1 = new Complex()


        Object o = null;
        for (int i = 0; i < 10; i++) {
            o = new Object();
            System.out.println(o.hashCode());
        }


        System.out.println("*****************");




    }
}
