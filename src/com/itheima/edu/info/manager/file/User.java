package com.itheima.edu.info.manager.file;

import java.io.Serializable;

public class User implements Serializable {
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    private String name;
    private String password;

    private static final long serialVersionUID = 111111111;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
