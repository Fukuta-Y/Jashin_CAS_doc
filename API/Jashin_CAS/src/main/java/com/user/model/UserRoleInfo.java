// src/main/java/com/example/demo/model/UserRoleInfo.java

package com.user.model;

public class UserRoleInfo {
    private String userId;       // ユーザID
    private String userName;     // 名前
    private int roleMode;        // 編集権限モード

    // コンストラクタ
    public UserRoleInfo(String userId, String userName, int roleMode) {
        this.userId = userId;
        this.userName = userName;
        this.roleMode = roleMode;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoleMode() {
        return roleMode;
    }

    public void setRoleMode(int roleMode) {
        this.roleMode = roleMode;
    }
}
