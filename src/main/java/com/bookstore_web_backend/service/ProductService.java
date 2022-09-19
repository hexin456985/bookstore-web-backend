package com.bookstore_web_backend.service;

import com.bookstore_web_backend.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    public Product insertProduct (int productId, int book_id, int seller_id, String product_description, BigDecimal productPrice);
    public void deleteProduct (int productId);
    public void deleteAllProduct();
    public Product findProduct (int productId);
    public List<Product> findAllProduct ();
}
