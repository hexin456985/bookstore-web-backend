package com.bookstore_web_backend.service;

import com.bookstore_web_backend.dao.*;
import com.bookstore_web_backend.entity.*;
import lombok.val;

public class service_example {
    public void example()
    {
        BookCategoryInfo bi= new BookCategoryInfo();
        UserInfo UI = new UserInfo();
        int id = bi.getBookCategoryId();
        Integer ui = UI.getUserId();
        return;
    }
}
