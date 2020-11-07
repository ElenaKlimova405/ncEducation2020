package com.nc.autumn2020.projects.project1;

import java.util.Date;

public class Message {
    private String message;
    private Level level;
    private String date;

    public Message(String message, Level level) {
        this.message = message;
        this.level = level;
        this.date = new Date().toString();
    }

    public String getMessage() {
        return this.message;
    }

    public Level getLevel() {
        return this.level;
    }

    public String getDate() {
        return this.date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.date + " "
                + this.level + ": "
                + this.message;

    }
}
