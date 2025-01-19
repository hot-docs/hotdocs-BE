package com.example.backend.domain.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.user.application.UserAccountService;

@RestController
@RequestMapping("api/account")
public class UserAccountController {
    // 마이페이지 관련 API
    /*
     * 최신 작업 문서
     * 내 문서 목록
     * 내 문서 보기
     */

    @Autowired
    private UserAccountService accountService;

}
