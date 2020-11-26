package com.nc.autumn2020.solutions.lesson16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Grade {
    private int grade;
    private Date date;
    private Teacher teacher;
    private SimpleDateFormat formatForDateNow =
            new SimpleDateFormat("'Дата: 'yyyy.MM.dd ' и время: 'hh:mm:ss:SSS a");

    public Grade(int grade, Teacher teacher) {
        this.grade = Math.abs(grade);
        this.date = new Date();
        this.teacher = teacher;
    }

    public int getGrade() {
        return this.grade;
    }

    public String getDate() {
        return formatForDateNow.format(this.date);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                ", date=" + date +
                ", teacher=" + teacher +
                '}';
    }
}
