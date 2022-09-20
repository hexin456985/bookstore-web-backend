package com.bookstore_web_backend.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @GetMapping("/home")
    public String Home() {
        return "home";
    }

    @GetMapping("/shopProduct")
    public String ShopProduct() {
        return "shopProduct";
    }

    @GetMapping("/contactus")
    public String Contactus() {
        return "contactus";
    }

    @GetMapping("/admin/logout")
    public String Logout() {
        return "index";
    }
}
