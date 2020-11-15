package com.nc.autumn2020.lessons.lesson10;

import com.nc.autumn2020.LessonApi;


public class GenericClass implements LessonApi {
    @Override
    public void executeSolution(String[] args) {


        MyGeneric<?> myGeneric = new MyGeneric<>(
                Integer.valueOf(1), String.valueOf(2),
                new Integer[] {3, 4, 5}
                );

        System.out.println(myGeneric.getArg1());
        System.out.println(myGeneric.getArg2());
        Integer[] integers = (Integer[]) myGeneric.getArgs();
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        System.out.println("------");


        MyGeneric<Apple> myGeneric2 = new MyGeneric<>(
                new Apple(1), new RedApple(2),
                new Apple[] {new Apple(3), new RedApple(4), new GreenApple(5)}
        );

        Apple arg1 = myGeneric2.getArg1();
        myGeneric2.setArg1(new GreenApple(1));

        System.out.println(myGeneric2);

        System.out.println("--------------");



        MyGeneric<? extends Apple> myGeneric3 = new MyGeneric<>(
                new Apple(1), new RedApple(2),
                new Apple[] {new Apple(3), new RedApple(4), new GreenApple(5)}
        );

        Apple arg11 = myGeneric3.getArg1();
        Object arg2 = myGeneric3.getArg2();
        Fruit arg12 = myGeneric3.getArg1();
        //RedApple arg21 = (RedApple) myGeneric3.getArg2();//можно, если закастить

       // myGeneric3.setArg1(new Apple(6));//no
      //  myGeneric3.setArg1(new GreenApple(6));//no
      //  myGeneric3.setArgs(new Apple[]{new Apple(6), new Apple(7)});//no


        System.out.println(myGeneric3);

        System.out.println("----------------");




        MyGeneric<? super Apple> myGeneric4 = new MyGeneric<>(
                new Orange(1), new Fruit(2),
                new Apple[] {new Apple(3), new RedApple(4), new GreenApple(5)}
        );

        Object arg13 = myGeneric4.getArg1();
        //Apple arg213 = (Apple) myGeneric4.getArg2();// только закастив
        Fruit arg214 = (Fruit) myGeneric4.getArg2();// только закастив
        Orange arg14 = (Orange) myGeneric4.getArg1();// только закастив

        System.out.println(myGeneric4);

        // myGeneric4.setArg1(new Orange(1));//no
        myGeneric4.setArg1(new Apple(1));
        myGeneric4.setArg1(new RedApple(1));
       // myGeneric4.setArg1(new Fruit(1));//no



        System.out.println(myGeneric4);



    }
}

class Fruit {
    int i;
    public Fruit(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Fruit " + i;
    }


}

class Apple extends Fruit {
    int i;
    public Apple(int i) {
        super(i);
        this.i = i;
    }

    @Override
    public String toString() {
        return "Apple " + i;
    }
}

class Orange extends Fruit {
    int i;
    public Orange(int i) {
        super(i);
        this.i = i;
    }

    @Override
    public String toString() {
        return "Orange " + i;
    }
}

class RedApple extends Apple {
    int i;
    public RedApple(int i) {
        super(i);
        this.i = i;
    }

    @Override
    public String toString() {
        return "RedApple " + i;
    }
}

class GreenApple extends Apple {
    int i;
    public GreenApple(int i) {
        super(i);
        this.i = i;
    }

    @Override
    public String toString() {
        return "GreenApple " + i;
    }
}

class RedOrange extends Orange {
    int i;
    public RedOrange(int i) {
        super(i);
        this.i = i;
    }

    @Override
    public String toString() {
        return "RedOrange " + i;
    }
}

class SmallOrange extends Orange {
    int i;
    public SmallOrange(int i) {
        super(i);
        this.i = i;
    }

    @Override
    public String toString() {
        return "SmallOrange " + i;
    }
}

class MyGeneric<T> {
    T arg1;
    T arg2;
    T[] args;

    public MyGeneric(T arg1, T arg2, T[] args) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.args = args;
    }

    public T getArg1() {
        return arg1;
    }

    public T getArg2() {
        return arg2;
    }

    public T[] getArgs() {
        return args;
    }

    public void setArg1(T arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(T arg2) {
        this.arg2 = arg2;
    }

    public void setArgs(T[] args) {
       this.args = args;
    }



    @Override
    public String toString() {
        String ans = arg1 + " "
                + arg2 + " [";
        for (T arg : args) {
            ans += arg.toString() + " ";
        }
        ans += "]";
        return ans;
    }
}
