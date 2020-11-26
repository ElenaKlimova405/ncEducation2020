package com.nc.autumn2020.solutions.lesson16;

public abstract class Human implements Runnable{
    private String firstName;
    private String secondName;
    private String lastName;

    public Human(String firstName, String secondName, String lasttName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lasttName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
