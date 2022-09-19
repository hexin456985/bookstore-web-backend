package com.bookstore_web_backend.service.impl;

import com.bookstore_web_backend.dao.BookcategoryinfoRepository;
import com.bookstore_web_backend.service.BookCategoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore_web_backend.entity.Bookcategoryinfo;
import com.bookstore_web_backend.dao.BookcategoryinfoRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional


public class BookCategoryInfoServiceImpl implements BookCategoryInfoService {
    @Autowired
    BookcategoryinfoRepository bookCategoryInfoRepository;

    @Override
    public Bookcategoryinfo insertBookCategoryInfo (int bookCategoryId, String bookCategoryName, String bookCategoryDescription) {
        Bookcategoryinfo bookCategoryInfo = new Bookcategoryinfo();

        bookCategoryInfo.setBookCategoryId(bookCategoryId);
        bookCategoryInfo.setBookCategoryName(bookCategoryName);
        bookCategoryInfo.setBookCategoryDescription(bookCategoryDescription);

        bookCategoryInfoRepository.save(bookCategoryInfo);
        return bookCategoryInfo;
    }

    @Override
    public void deleteBookCategoryInfo (int bookCategoryId) {

        bookCategoryInfoRepository.deleteById(bookCategoryId);
    }

    @Override
    public void deleteAllBookCategoryInfo()
    {
        bookCategoryInfoRepository.deleteAll();
    }

    @Override
    public Bookcategoryinfo findBookCategoryInfo (int bookCategoryId) {
        Bookcategoryinfo bookCategoryInfo = null;
        Optional<Bookcategoryinfo> optional = bookCategoryInfoRepository.findById(bookCategoryId);
        if (optional.isPresent()) {
            bookCategoryInfo = optional.get();
        }
        else {
            throw new RuntimeException("Book Category not found for id: " + bookCategoryId);
        }
        return bookCategoryInfo;
    }

    @Override
    public List<Bookcategoryinfo> findAllBookCategoryInfo () {
        List<Bookcategoryinfo> List_bookCategoryInfo = bookCategoryInfoRepository.findAll();
        return List_bookCategoryInfo;
    }

}