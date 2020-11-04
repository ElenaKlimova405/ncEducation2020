package com.nc.autumn2020.lessons.lesson8;

public class Number {
    private int num;
    private int i;

    public Number() {
    }

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public int hashCode() {
        return (int)(num ^ (num >>> 32));
    }
}
