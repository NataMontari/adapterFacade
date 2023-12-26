package com.example;
public class FacebookUser {
    private User user;

    public FacebookUser(User user){
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
