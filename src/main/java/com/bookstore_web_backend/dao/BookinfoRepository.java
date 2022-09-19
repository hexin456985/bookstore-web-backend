package com.bookstore_web_backend.dao;

import com.bookstore_web_backend.entity.Bookinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookinfoRepository extends JpaRepository<Bookinfo, Integer>, JpaSpecificationExecutor<Bookinfo> {

}