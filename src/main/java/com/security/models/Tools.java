package com.security.models;

public class Tools {
    private Integer userId;
    private String toolName;
    private Integer toolId;
    private Integer descriptionId;

    public Tools() {
    }
    
    public Tools(Integer userId, String toolName, Integer toolId, Integer descriptionId) {
        this.userId = userId;
        this.toolName = toolName;
        this.toolId = toolId;
        this.descriptionId = descriptionId;
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getToolName() {
        return toolName;
    }
    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
    public Integer getToolId() {
        return toolId;
    }
    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }
    public Integer getDescriptionId() {
        return descriptionId;
    }
    public void setDescriptionId(Integer descriptionId) {
        this.descriptionId = descriptionId;
    }
}
