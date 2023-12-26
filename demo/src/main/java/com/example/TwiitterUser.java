package com.example;
public class TwiitterUser {

    private User user;

    public TwitterUser(User user){
        this.user = user;
    }
    @Override
    public String getEmail() {
        return user.getEmail();
    }
    @Override
    public String getCountry(){
        return user.getCountry();
    }
    @Override
    public long getLastActiveTime(){
        return user.getLastActiveTime();
    }
}