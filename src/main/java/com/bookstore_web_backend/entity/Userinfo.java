package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "userinfo")
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "userId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "userNames", nullable = false)
    private String userNames;

    @Column(name = "userPassword")
    private String userPassword;

    @Column(name = "userEmail", nullable = false)
    private String userEmail;

}
