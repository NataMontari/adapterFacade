package com.example;

public class Authorization{
    public boolean authorize(DataBase db) {
        db.getUserData();
        return true;
    }
}