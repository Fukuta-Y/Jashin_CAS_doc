// src/main/java/com/example/demo/repository/UserInfoRepository.java

package com.user.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.user.mapper.UserInfoMapper;
import com.user.model.UserRoleInfo;

@Repository
public class UserInfoRepository {

    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoRepository(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    // userIdでユーザー情報を取得するメソッド
    public UserRoleInfo findUserRoleInfoByUserId(String userId) {
    	System.out.println("userId2:" + userId);
        return userInfoMapper.getUserRoleInfoByUserId(userId);
    }
}




