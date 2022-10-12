package com.ll.exam.tossapp.product.repository;

import com.ll.exam.tossapp.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
