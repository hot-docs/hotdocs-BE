package com.example.backend.domain.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.template.application.DesignerTemplateService;

@RestController
@RequestMapping("api/designer/templates")
public class DesignerTemplateController {
    /*
     * [ 템플릿 관련 디자이너 기능 ]
     * 템플릿 등록
     * 템플릿 수정
     */

    @Autowired
    private DesignerTemplateService designerTemplateService;
}
