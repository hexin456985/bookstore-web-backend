package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "bookcategoryinfo")
public class Bookcategoryinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "bookCategoryId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookCategoryId;

    @Column(name = "bookCategoryName", nullable = false)
    private String bookCategoryName;

    @Column(name = "bookCategoryDescription")
    private String bookCategoryDescription;

}
