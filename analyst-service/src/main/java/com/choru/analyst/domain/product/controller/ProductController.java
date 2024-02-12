package com.choru.analyst.domain.product.controller;

import com.choru.analyst.domain.product.controller.dto.ProductCreateReq;
import com.choru.analyst.domain.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public void create(@RequestBody ProductCreateReq req){
        service.create(req);
    }
}
