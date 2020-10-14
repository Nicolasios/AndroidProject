package com.example.test.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 * 创建一个user类保存user的信息
 * 信息包括自动生成的主键userId和用户名
 * 本类中的用户名为虚拟用户jane
 */
public class LoggedInUser {

    private String userId;
    private String displayName;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
