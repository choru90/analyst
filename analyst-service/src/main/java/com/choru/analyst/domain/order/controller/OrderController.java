package com.choru.analyst.domain.order.controller;

import com.choru.analyst.domain.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public void order(){
        service.order();
    }
}
