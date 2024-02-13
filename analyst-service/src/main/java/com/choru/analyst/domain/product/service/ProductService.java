package com.choru.analyst.domain.product.service;

import com.choru.analyst.domain.product.controller.dto.ProductCreateReq;
import com.choru.analyst.domain.product.entity.Product;
import com.choru.analyst.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    public void create(ProductCreateReq req){
        repository.save(Product.of(req.name(), req.price()));
    }

    @Transactional
    public void update(Long id, ProductCreateReq req) {
        Product product = repository.findById(id).orElseThrow(() -> new RuntimeException("해당 id의 상품이 없습니다."));
        product.update(req.name(), req.price());
    }
}
