package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "bookinfo")
public class Bookinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "bookId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(name = "bookPrice", nullable = false)
    private BigDecimal bookPrice;

    @Column(name = "bookNames", nullable = false)
    private String bookNames;

    @Column(name = "bookAuthor", nullable = false)
    private String bookAuthor;

    @Column(name = "bookDescription")
    private String bookDescription;

}
