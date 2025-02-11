package com.example.backend.domain.template.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.template.application.TemplateService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "Template API", description = "templates")
@RestController
@RequestMapping("api/templates")
public class TemplateController {
    /*
     * 템플릿 목록 출력
     * 템플릿 상세 보기
     */

    @Autowired
    private TemplateService templateService;

    @Operation(summary = "템플릿 목록 출력", description = "홈화면에서 호출")
    @GetMapping("")
    public ResponseEntity<?> getMethodName(
            @PageableDefault(page = 0, size = 12, sort = "id", direction = Sort.Direction.DESC) Pageable pageable,
            @RequestParam(name = "type", required = false, defaultValue = "0") int type,
            @RequestParam(name = "query", required = false) String query,
            @RequestParam(name = "sortby", required = false, defaultValue = "0") int sortby) {

        try {
            Map<String, Object> mapData = new HashMap<>();
            mapData.put("pageable", pageable);
            mapData.put("type", type);
            mapData.put("sortby", sortby);
            mapData.put("query", query);

            Map<String, Object> result = templateService.getTemplateList(mapData);

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("템플릿 목록이 존재하지 않습니다.");
        }
    }

}
