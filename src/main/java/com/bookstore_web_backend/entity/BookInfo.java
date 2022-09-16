package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "book_info")
public class BookInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "book_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(name = "book_price", nullable = false)
    private BigDecimal bookPrice;

    @Column(name = "book_names", nullable = false)
    private String bookNames;

    @Column(name = "book_author", nullable = false)
    private String bookAuthor;

    @Column(name = "book_description")
    private String bookDescription;
}
