package com.bookstore_web_backend.service;

import com.bookstore_web_backend.entity.Bookinfo;

import java.math.BigDecimal;
import java.util.List;

public interface BookInfoService {
    public Bookinfo insertBookInfo (int bookId, BigDecimal bookPrice, String bookNames, String bookAuthor, String bookDescription);
    public void deleteBookInfo (int bookId);
    public void deleteAllBookInfo();
    public Bookinfo findBookInfo (int bookId);
    public List<Bookinfo> findAllBookInfo ();
}


