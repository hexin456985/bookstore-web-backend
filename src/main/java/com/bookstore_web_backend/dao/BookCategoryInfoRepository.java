package com.bookstore_web_backend.dao;

import com.bookstore_web_backend.entity.BookCategoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookCategoryInfoRepository extends JpaRepository<BookCategoryInfo, Integer>, JpaSpecificationExecutor<BookCategoryInfo> {

}