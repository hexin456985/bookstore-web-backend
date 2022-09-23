package com.bookstore_web_backend.service;

import com.bookstore_web_backend.entity.Bookcategoryinfo;

import java.util.List;


public interface BookCategoryInfoService {
    public Bookcategoryinfo insertBookCategoryInfo (int bookCategoryId, String bookCategoryName,String bookCategoryDescription);
    public void deleteBookCategoryInfo (int bookCategoryId);
    public void deleteAllBookCategoryInfo();
    public Bookcategoryinfo findBookCategoryInfo (int bookCategoryId);
    public List<Bookcategoryinfo> findAllBookCategoryInfo ();
}