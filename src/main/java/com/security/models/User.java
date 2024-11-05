package com.security.models;

public abstract class User {
    private Integer userId;
    private String name;
    private Integer cityId;
    private Integer stateId;
    private String email;
    private String password;

    public User() {
    }
    
    public User(Integer userId, String name, Integer cityId, Integer stateId, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.cityId = cityId;
        this.stateId = stateId;
        this.email = email;
        this.password = password;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCityId() {
        return cityId;
    }
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
    public Integer getStateId() {
        return stateId;
    }
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
