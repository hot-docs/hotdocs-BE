package com.example.backend.domain.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.template.application.TemplateService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "Sqagger API", description = "templates")
@RestController
@RequestMapping("api/templates")
public class TemplateController {
    /*
     * 템플릿 목록 출력
     * 템플릿 상세 보기
     */

    @Autowired
    private TemplateService templateService;

    @Operation(summary = "템플릿 목록 출력", description = "메인화면에서 호출")
    @GetMapping("")
    public String getMethodName() {
        return "hi";
    }

}
