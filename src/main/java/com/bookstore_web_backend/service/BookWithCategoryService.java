package com.bookstore_web_backend.service;

import com.bookstore_web_backend.entity.Bookwithcategory;

import java.util.List;


public interface BookWithCategoryService {
    public Bookwithcategory insertBookWithCategory (int bookId, int bookCategoryId);
    public void deleteBookWithCategory (int bookId);
    public void deleteAllBookWithCategory();
    public Bookwithcategory findBookWithCategory (int bookId);
    public List<Bookwithcategory> findAllBookWithCategory ();
}

