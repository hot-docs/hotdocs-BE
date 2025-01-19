package com.example.backend.domain.template.dto.response;

import com.example.backend.domain.template.entity.TemplateEnums.BlockType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateBlocksResponseDTO { // 서버 -> 클라
    private Long id; // 템플릿 블록 PK
    private BlockType blockType; // 블록 타입
    private int page; // 템플릿에서 현재 페이지
    private int templateOrder; // 블록 안의 순서
    private String contents; // 내용
    private String style; // 스타일
}
