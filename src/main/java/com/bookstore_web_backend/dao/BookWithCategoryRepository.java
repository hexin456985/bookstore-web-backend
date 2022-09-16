package com.bookstore_web_backend.dao;

import com.bookstore_web_backend.entity.BookWithCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookWithCategoryRepository extends JpaRepository<BookWithCategory, Integer>, JpaSpecificationExecutor<BookWithCategory> {

}