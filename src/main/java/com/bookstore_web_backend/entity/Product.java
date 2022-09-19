package com.bookstore_web_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "productId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Column(name = "bookId", nullable = false)
    private Integer bookId;

    @Column(name = "sellerId", nullable = false)
    private Integer sellerId;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "productPrice", nullable = false)
    private BigDecimal productPrice;

}
