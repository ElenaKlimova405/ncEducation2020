package com.nc.autumn2020.lessons.lesson5;

public class Z {
    protected Integer a,b;
    protected Integer c;

    public Z(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    private void secret() {
        System.out.println(a+b);
    }

    protected void hello() {
        System.out.println(a-b);
    }

}
