// src/main/java/com/example/demo/mapper/UserInfoMapper.java

package com.user.mapper;
import org.apache.ibatis.annotations.Mapper;

import com.user.model.UserRoleInfo;
@Mapper
public interface UserInfoMapper {
    // userIdでユーザー情報を取得するメソッド
    UserRoleInfo getUserRoleInfoByUserId(String userId);
}