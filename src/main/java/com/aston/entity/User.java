package com.aston.entity;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class User {
    private String userName;
    private TreeMap accaunts;

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
