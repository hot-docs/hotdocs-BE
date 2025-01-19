package com.example.backend.domain.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.template.application.AdminTemplateService;

@RestController
@RequestMapping("api/admin/templates")
public class AdminTemplateController {
    /*
     * [템플릿 관련 관리자 기능]
     * 템플릿 게시 승인
     * 템플릿 게시 요청 목록
     */

    @Autowired
    private AdminTemplateService adminTemplateService;

}
