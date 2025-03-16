// src/main/java/com/example/demo/service/UserRoleInfoService.java

package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.UserRoleInfo;
import com.user.repository.UserInfoRepository;

@Service
public class UserRoleInfoService {

    private final UserInfoRepository userInfoRepository;

    @Autowired
    public UserRoleInfoService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    // ユーザIDを使ってユーザー情報を取得
    public UserRoleInfo getUserRoleInfoByUserId(String userId) {
        return userInfoRepository.findUserRoleInfoByUserId(userId);
    }
}
