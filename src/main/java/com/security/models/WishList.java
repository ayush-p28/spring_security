package com.security.models;

public class WishList {
    private Integer userId;
    private String toolId;
    private String wishlistId;

    public WishList() {
    }

    public WishList(Integer userId, String toolId, String wishlistId) {
        this.userId = userId;
        this.toolId = toolId;
        this.wishlistId = wishlistId;
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getToolId() {
        return toolId;
    }
    public void setToolId(String toolId) {
        this.toolId = toolId;
    }
    public String getWishlistId() {
        return wishlistId;
    }
    public void setWishlistId(String wishlistId) {
        this.wishlistId = wishlistId;
    }
}
