package com.example.backend.domain.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.user.application.AdminService;

@RestController
@RequestMapping("api/admin")
public class AdminController {
    /*
     * 회원정보 목록
     */

    @Autowired
    private AdminService adminService;
}
