package com.nc.autumn2020.lessons.lesson8;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private List<Role> roles;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
