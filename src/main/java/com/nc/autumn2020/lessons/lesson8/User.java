package com.nc.autumn2020.lessons.lesson8;

import java.util.Arrays;

public class User {
    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public User() {
    }

    public User(int id, String username, String password, Role[] roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='[HIDDEN]'" +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}
