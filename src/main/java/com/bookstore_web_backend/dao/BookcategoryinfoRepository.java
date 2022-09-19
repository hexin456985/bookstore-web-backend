package com.bookstore_web_backend.dao;

import com.bookstore_web_backend.entity.Bookcategoryinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookcategoryinfoRepository extends JpaRepository<Bookcategoryinfo, Integer>, JpaSpecificationExecutor<Bookcategoryinfo> {

}