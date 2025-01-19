package com.example.backend.domain.docs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.docs.application.DocsService;

@RestController
public class DocsController {
    /*
     * 내 문서 조회
     * 현재 문서 저장
     * 최신 작업문서 목록
     */

    @Autowired
    private DocsService docsService;

}
