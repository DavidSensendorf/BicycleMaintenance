package com.sensendorf.bikemaintenance.model.userdata;

import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;


import java.util.List;

public class Cyclist {
    private List<Bicycle> bicycleList;
    private int cyclistId;
    private String name;
    private String email;
    private String login;
    private String password;
    private String oAuthIdentifier;

    public Cyclist() {
    }

    public Cyclist(List<Bicycle> bicycleList, int cyclistId, String name, String email, String login, String password, String oAuthIdentifier) {
        this.bicycleList = bicycleList;
        this.cyclistId = cyclistId;
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
        this.oAuthIdentifier = oAuthIdentifier;
    }

    public String getoAuthIdentifier() {
        return oAuthIdentifier;
    }

    public void setoAuthIdentifier(String oAuthIdentifier) {
        this.oAuthIdentifier = oAuthIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCyclistId() {
        return cyclistId;
    }

    public void setCyclistId(int cyclistId) {
        this.cyclistId = cyclistId;
    }

    public List<Bicycle> getBicycleList() {
        return bicycleList;
    }

    public void setBicycleList(List<Bicycle> bicycleList) {
        this.bicycleList = bicycleList;
    }
}
