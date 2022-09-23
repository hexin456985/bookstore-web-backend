package com.bookstore_web_backend.service;

import com.bookstore_web_backend.entity.Userinfo;

import java.util.List;


public interface UserInfoService {
    public Userinfo insertUserInfo (int userId, String userNames, String userPassword, String userEmail);
    public void deleteUserInfo (int userId);
    public void deleteAllUserInfo();
    public Userinfo findUserInfo (int userId);
    public List<Userinfo> findAllUserInfo ();
}
