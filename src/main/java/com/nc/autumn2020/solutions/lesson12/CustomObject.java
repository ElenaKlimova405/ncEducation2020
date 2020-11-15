package com.nc.autumn2020.solutions.lesson12;

public class CustomObject {
    private Integer value = 2;

    public CustomObject(Integer value) {
        this.value = value;
    }

    private Integer getValue() {
        return this.value;
    }

    private void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "value=" + value +
                '}';
    }
}
