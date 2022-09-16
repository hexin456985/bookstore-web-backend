package com.bookstore_web_backend.dao;

import com.bookstore_web_backend.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookInfoRepository extends JpaRepository<BookInfo, Integer>, JpaSpecificationExecutor<BookInfo> {

}