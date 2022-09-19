package com.bookstore_web_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.bookstore_web_backend.service.impl.UserInfoServiceImpl;
import com.bookstore_web_backend.dao.UserinfoRepository;
import com.bookstore_web_backend.entity.Userinfo;

@Controller
public class LoginController {
    private UserinfoRepository userInfoRepository;

    @Autowired
    private UserInfoServiceImpl userInfoService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("userinfo", new Userinfo());
        return "user_login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Userinfo userinfo) {
        if (userInfoRepository.findByUserEmail(userinfo.getUserEmail()) == null) {
            return "login";
        }
        else {
            return "home";
        }
    }

}
