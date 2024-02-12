package com.choru.analyst.domain.product.service;

import com.choru.analyst.domain.product.controller.dto.ProductCreateReq;
import com.choru.analyst.domain.product.entity.Product;
import com.choru.analyst.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    public void create(ProductCreateReq req){
        repository.save(Product.of(req.name(), req.price()));
    }
}
