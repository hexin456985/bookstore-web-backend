package com.bookstore_web_backend.service.impl;

import com.bookstore_web_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore_web_backend.entity.Product;
import com.bookstore_web_backend.dao.ProductRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product insertProduct (int productId, int book_id, int seller_id, String product_description, BigDecimal productPrice) {
        Product product = new Product();

        product.setProductId(productId);
        product.setBookId(book_id);
        product.setSellerId(seller_id);
        product.setProductDescription(product_description);
        product.setProductPrice(productPrice);

        productRepository.save(product);
        return product;
    }

    @Override
    public void deleteProduct (int productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product findProduct (int productId) {
        Product product = null;
        Optional<Product> optional = productRepository.findById(productId);
        if (optional.isPresent()) {
            product = optional.get();
        }
        else {
            throw new RuntimeException("Product not found for id: " + productId);
        }
        return product;
    }

    @Override
    public void deleteAllProduct() {
        productRepository.deleteAll();
    }

    @Override
    public List<Product> findAllProduct () {
        List<Product> List_product = productRepository.findAll();
        return List_product;
    }
}
