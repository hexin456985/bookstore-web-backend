package com.bookstore_web_backend.service;

import com.bookstore_web_backend.entity.UserInfo;

import java.util.Optional;
import java.util.List;

public interface UserInfoService {
    public UserInfo insertUserInfo (int userId, String userNames, String userPassword, String userEmail);
    public void deleteUserInfo (int userId);
    public Optional<UserInfo> findUserInfo (int userId);
    public List<UserInfo> findAllUserInfo ();
}
