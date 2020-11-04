package com.nc.autumn2020.lessons.lesson8;



import java.util.Objects;

public class Complex {
    private int a;
    private int i;

    public Complex(int a, int i) {
        this.a = a;
        this.i = i;
    }

    public int getA() {
        return a;
    }

    public int getI() {
        return i;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setI(int i) {
        this.i = i;
    }

   @Override
    public int hashCode() {
        return (int)(a + Math.pow(i, 2));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return a == complex.a && i == complex.i;
    }
}
