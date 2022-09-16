package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "book_category_info")
public class BookCategoryInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_category_id", nullable = false)
    private Integer bookCategoryId;

    @Column(name = "book_category_name", nullable = false)
    private String bookCategoryName;

    @Column(name = "book_category_description")
    private String bookCategoryDescription;

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }
}
