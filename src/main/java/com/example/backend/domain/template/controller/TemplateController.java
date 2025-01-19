package com.example.backend.domain.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.template.application.TemplateService;

@RestController
@RequestMapping("api/templates")
public class TemplateController {
    /*
     * 템플릿 목록 출력
     * 템플릿 상세 보기
     */

    @Autowired
    private TemplateService templateService;
}
