package com.aston.entities;

import java.util.TreeMap;

public class User {
    private String userName;
    private TreeMap accaunt;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "userName: " + userName;
    }
}
