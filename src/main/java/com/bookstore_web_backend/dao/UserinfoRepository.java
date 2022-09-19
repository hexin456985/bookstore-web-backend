package com.bookstore_web_backend.dao;

import com.bookstore_web_backend.entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserinfoRepository extends JpaRepository<Userinfo, Integer>, JpaSpecificationExecutor<Userinfo> {
    Userinfo findByUserNames(String name);
    Userinfo findByUserEmail(String email);
}