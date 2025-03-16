// src/main/java/com/example/demo/model/ApiResponse.java

package com.user.model;

public class ApiResponse {
    private boolean success;       // 実行結果: 成功ならtrue、失敗ならfalse
    private Object results;        // 実行結果のデータ（UserRoleInfoが含まれる）
    private String info;           // 実行に関するメッセージ

    // コンストラクタ
    public ApiResponse(boolean success, Object results, String info) {
        this.success = success;
        this.results = results;
        this.info = info;
    }

    // Getters and Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
