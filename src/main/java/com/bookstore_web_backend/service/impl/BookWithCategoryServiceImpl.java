package com.bookstore_web_backend.service.impl;

import com.bookstore_web_backend.dao.BookwithcategoryRepository;
import com.bookstore_web_backend.entity.Bookwithcategory;

import com.bookstore_web_backend.service.BookWithCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional


public class BookWithCategoryServiceImpl implements BookWithCategoryService {
    @Autowired
    BookwithcategoryRepository bookWithCategoryRepository;

    @Override
    public Bookwithcategory insertBookWithCategory (int bookId,int bookCategoryId) {
        Bookwithcategory bookWithCategory = new Bookwithcategory();

        bookWithCategory.setBookId(bookId);
        bookWithCategory.setBookCategoryId(bookCategoryId);

        return bookWithCategory;
    }

    @Override
    public void deleteBookWithCategory (int bookId) {

        bookWithCategoryRepository.deleteById(bookId);
    }

    @Override
    public void deleteAllBookWithCategory()
    {
        bookWithCategoryRepository.deleteAll();
    }

    @Override
    public Bookwithcategory findBookWithCategory (int bookId) {
        Bookwithcategory bookWithCategory = null;
        Optional<Bookwithcategory> optional = bookWithCategoryRepository.findById(bookId);
        if (optional.isPresent()) {
            bookWithCategory = optional.get();
        }
        else {
            throw new RuntimeException("Book not found for id: " + bookId);
        }
        return bookWithCategory;
    }

    @Override
    public List<Bookwithcategory> findAllBookWithCategory () {
        List<Bookwithcategory> List_bookWithCategory = bookWithCategoryRepository.findAll();
        return List_bookWithCategory;
    }
}