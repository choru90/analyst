package com.choru.analyst.domain.product.controller;

import com.choru.analyst.domain.product.controller.dto.ProductCreateReq;
import com.choru.analyst.domain.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public void create(@RequestBody ProductCreateReq req){
        service.create(req);
    }

    @PutMapping
    public void update(@RequestParam(value = "id") Long id, @RequestBody ProductCreateReq req){
        service.update(id, req);
    }
}
