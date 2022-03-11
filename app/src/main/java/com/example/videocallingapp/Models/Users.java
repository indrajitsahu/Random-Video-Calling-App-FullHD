package com.example.videocallingapp.Models;

public class Users {

    private String uId, profile, name, city, email;
    private long coins;

    public Users(){}

//    public Users(String uId, String profile, String name, String city, long coins, String email) {
//        this.uId = uId;
//        this.profile = profile;
//        this.name = name;
//        this.city = city;
//        this.coins = coins;
//        this.email = email;
//    }
    public Users(String uId, String profile, String name, String city, long coins) {
        this.uId = uId;
        this.profile = profile;
        this.name = name;
        this.city = city;
        this.coins = coins;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getuId() {
        return uId;
    }

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
