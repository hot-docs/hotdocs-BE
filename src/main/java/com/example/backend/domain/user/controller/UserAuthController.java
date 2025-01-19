package com.example.backend.domain.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.user.application.UserAuthService;

@RestController
@RequestMapping("api/auth")
public class UserAuthController {
    // 사용자 인가 관련 API
    /*
     * 로그인
     * 회원가입
     * 카카오로그인
     * 아이디 비번 찾기
     * 토큰
     */

    @Autowired
    private UserAuthService authService;
}
