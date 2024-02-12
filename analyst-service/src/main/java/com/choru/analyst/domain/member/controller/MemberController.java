package com.choru.analyst.domain.member.controller;

import com.choru.analyst.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService service;

    @PostMapping("/member")
    public void create(){
        service.create();
    }
}
