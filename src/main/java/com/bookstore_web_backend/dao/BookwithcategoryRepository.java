package com.bookstore_web_backend.dao;

import com.bookstore_web_backend.entity.Bookwithcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookwithcategoryRepository extends JpaRepository<Bookwithcategory, Integer>, JpaSpecificationExecutor<Bookwithcategory> {

}