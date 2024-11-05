package com.security.models;

public class PremiumDetails {
    private Integer userId;
    private Integer startDate;
    private Integer endDate;
    private Integer subscriptionType;
    private String subscriptionId;
    
    public PremiumDetails() {
    }

    public PremiumDetails(Integer userId, Integer startDate, Integer endDate, Integer subscriptionType,
            String subscriptionId) {
        this.userId = userId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.subscriptionType = subscriptionType;
        this.subscriptionId = subscriptionId;
    }


    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getStartDate() {
        return startDate;
    }
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }
    public Integer getEndDate() {
        return endDate;
    }
    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }
    public Integer getSubscriptionType() {
        return subscriptionType;
    }
    public void setSubscriptionType(Integer subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
    public String getSubscriptionId() {
        return subscriptionId;
    }
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
}
