// src/main/java/com/example/demo/controller/UserRoleInfoController.java

package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.ApiResponse;
import com.user.model.UserRoleInfo;
import com.user.service.UserRoleInfoService;

@RestController
@RequestMapping("/api/UserRoleInfo")
public class UserRoleInfoController {

    private final UserRoleInfoService userRoleInfoService;

    @Autowired
    public UserRoleInfoController(UserRoleInfoService userRoleInfoService) {
        this.userRoleInfoService = userRoleInfoService;
    }

    @GetMapping("/{userId}")
    public ApiResponse getUserRoleInfo(@PathVariable String userId) {
        try {
        	System.out.println("userId1:" + userId);
            // サービスを使ってユーザー情報を取得
            UserRoleInfo userRoleInfo = userRoleInfoService.getUserRoleInfoByUserId(userId);

            if (userRoleInfo != null) {
                return new ApiResponse(true, userRoleInfo, "情報を正常に取得しました。");
            } else {
                return new ApiResponse(false, null, "指定されたユーザーが見つかりませんでした。");
            }
        } catch (Exception e) {
            return new ApiResponse(false, null, "データ取得に失敗しました: " + e.getMessage());
        }
    }
}
