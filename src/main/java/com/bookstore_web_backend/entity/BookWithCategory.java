package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@IdClass(BookWithCategory.class)
@Table(name = "book_with_category")
public class BookWithCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    @Id
    @Column(name = "book_category_id", nullable = false)
    private Integer bookCategoryId;
}
