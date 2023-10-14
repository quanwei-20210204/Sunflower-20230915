package com.sap.cc.bulletinboard.datastructure;

public class User {
    public User(String username) {
        this.username = username;
    }

    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
