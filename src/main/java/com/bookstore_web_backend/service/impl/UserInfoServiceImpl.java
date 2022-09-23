package com.bookstore_web_backend.service.impl;

import com.bookstore_web_backend.service.UserInfoService;
import com.bookstore_web_backend.dao.UserinfoRepository;
import com.bookstore_web_backend.entity.Userinfo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.List;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserinfoRepository userInfoRepository;

    @Override
    public Userinfo insertUserInfo (int userId, String userNames, String userPassword, String userEmail) {
        Userinfo userInfo = new Userinfo();

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
    public Userinfo findUserInfo (int userId) {
        Userinfo userInfo = null;
        Optional<Userinfo> optional = userInfoRepository.findById(userId);
        if (optional.isPresent()) {
            userInfo = optional.get();
        }
        else {
            throw new RuntimeException("User not found for id: " + userId);
        }
        return userInfo;
    }

    @Override
    public void deleteAllUserInfo() {
        userInfoRepository.deleteAll();
    }

    @Override
    public List<Userinfo> findAllUserInfo () {
        List<Userinfo> List_userInfo = userInfoRepository.findAll();
        return List_userInfo;
    }
}
