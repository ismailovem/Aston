package com.aston.entities;

import java.util.Objects;

public class User {
    public static int counter = 0;
    private Integer id;
    private String userName;
    private Account account;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
        this.account = new Account();
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return userName;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer setAmount(int amount) {
         account.setAmount(amount);
         return account.getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id , userName);
    }

    @Override
    public String toString() {
        return getId() + ";" + userName + ";" + account.getAmount();
    }
}
