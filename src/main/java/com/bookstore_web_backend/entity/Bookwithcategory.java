package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@IdClass(Bookwithcategory.class)
@Table(name = "bookwithcategory")
public class Bookwithcategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "bookId", nullable = false)
    private Integer bookId;

    @Id
    @Column(name = "bookCategoryId", nullable = false)
    private Integer bookCategoryId;

}
