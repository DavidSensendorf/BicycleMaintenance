package com.sensendorf.bikemaintenance.model.userdata;

import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;

import java.util.List;

public class CyclistDto {
    private List<Bicycle> bicycleList;
    private int cyclistId;
    private String name;
    private String email;
    private String login;

    public CyclistDto(List<Bicycle> bicycleList, int cyclistId, String name, String email, String login) {
        this.bicycleList = bicycleList;
        this.cyclistId = cyclistId;
        this.name = name;
        this.email = email;
        this.login = login;
    }

    public CyclistDto() {
    }

    public List<Bicycle> getBicycleList() {
        return bicycleList;
    }

    public void setBicycleList(List<Bicycle> bicycleList) {
        this.bicycleList = bicycleList;
    }

    public int getCyclistId() {
        return cyclistId;
    }

    public void setCyclistId(int cyclistId) {
        this.cyclistId = cyclistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
