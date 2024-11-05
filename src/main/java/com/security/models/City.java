package com.security.models;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class City{
    private Integer cityId;
    private String name;
    private State state;

// =========================//Constructors\\============================\\ 
    public City(){}

    public City(Integer cityId,String name){
        this.cityId = cityId;
		this.name = name;
    }
    
    public City(Integer cityId){
        this.cityId = cityId;
    }

// =========================//Methods\\============================\\ 


// =========================//Getter-Setter\\============================\\ 
    public Integer getCityId() {
        return cityId;
    }
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
}

