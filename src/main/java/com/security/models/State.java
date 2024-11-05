package com.security.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class State{
    private Integer stateId;
    private String alias;
    private String name;

  // =========================//Constructors\\============================\\ 
public State(){}

public State(int stateId,String name){
    this.stateId = stateId;
    this.name = name;
}

public State(int stateId){
    this.stateId = stateId;
}

// =========================//Methods\\============================\\ 


// =========================//Getter-Setter\\============================\\   
    public Integer getStateId() {
        return stateId;
    }
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}