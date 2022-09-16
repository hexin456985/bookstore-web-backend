package com.bookstore_web_backend.service.impl;

import com.bookstore_web_backend.entity.Product;
import com.bookstore_web_backend.service.UserInfoService;
import com.bookstore_web_backend.dao.UserInfoRepository;
import com.bookstore_web_backend.entity.UserInfo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.List;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public UserInfo insertUserInfo (int userId, String userNames, String userPassword, String userEmail) {
        UserInfo userInfo = new UserInfo();

        userInfo.setUserId(userId);
        userInfo.setUserNames(userNames);
        userInfo.setUserPassword(userPassword);
        userInfo.setUserEmail(userEmail);

        userInfoRepository.save(userInfo);
        return userInfo;
    }

    @Override
    public void deleteUserInfo (int userId) {
        userInfoRepository.deleteById(userId);
    }

    @Override
    public UserInfo findUserInfo (int userId) {
        UserInfo userInfo = null;
        Optional<UserInfo> optional = userInfoRepository.findById(userId);
        if (optional.isPresent()) {
            userInfo = optional.get();
        }
        else {
            throw new RuntimeException("User not found for id: " + userId);
        }
        return userInfo;
    }

    @Override
    public List<UserInfo> findAllUserInfo () {
        List<UserInfo> List_userInfo = userInfoRepository.findAll();
        return List_userInfo;
    }
}
