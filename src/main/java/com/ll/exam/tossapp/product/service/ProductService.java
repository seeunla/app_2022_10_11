package com.ll.exam.tossapp.product.service;

import com.ll.exam.tossapp.app.song.entity.Song;
import com.ll.exam.tossapp.product.entity.Product;
import com.ll.exam.tossapp.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional
    public Product create(Song song, String subject, int price) {
        Product product = Product.builder()
                .subject(subject)
                .song(song)
                .author(song.getAuthor())
                .price(price)
                .build();

        productRepository.save(product);

        return product;
    }

    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }

    @Transactional
    public void modify(Product product, String subject, int price) {
        product.setSubject(subject);
        product.setPrice(price);
    }
}
