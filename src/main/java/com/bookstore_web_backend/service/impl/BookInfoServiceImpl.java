package com.bookstore_web_backend.service.impl;

import com.bookstore_web_backend.service.BookInfoService;

import com.bookstore_web_backend.entity.Bookinfo;
import com.bookstore_web_backend.dao.BookinfoRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@Transactional


public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    BookinfoRepository bookInfoRepository;

    @Override
    public Bookinfo insertBookInfo (int bookId, BigDecimal bookPrice, String bookNames, String bookAuthor, String bookDescription) {
        Bookinfo bookInfo = new Bookinfo();

        bookInfo.setBookId(bookId);
        bookInfo.setBookPrice(bookPrice);
        bookInfo.setBookNames(bookNames);
        bookInfo.setBookAuthor(bookAuthor);
        bookInfo.setBookDescription(bookDescription);

        bookInfoRepository.save(bookInfo);
        return bookInfo;
    }
    @Override
    public void deleteBookInfo (int bookId) {

        bookInfoRepository.deleteById(bookId);
    }

    @Override
    public void deleteAllBookInfo()
    {
        bookInfoRepository.deleteAll();
    }

    @Override
    public Bookinfo findBookInfo (int bookId) {
        Bookinfo bookInfo = null;
        Optional<Bookinfo> optional = bookInfoRepository.findById(bookId);
        if (optional.isPresent()) {
            bookInfo = optional.get();
        }
        else {
            throw new RuntimeException("Book not found for id: " + bookId);
        }
        return bookInfo;
    }

    @Override
    public List<Bookinfo> findAllBookInfo () {
        List<Bookinfo> List_bookInfo = bookInfoRepository.findAll();
        return List_bookInfo;
    }

}
