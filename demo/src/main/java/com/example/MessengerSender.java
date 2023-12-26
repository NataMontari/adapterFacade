package com.example;

public class MessageSender {
    public void sendMessage(String message, User user) {
        System.out.println("Sending message to " + user.getEmail() + ": " + message);
    }
}