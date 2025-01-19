package com.example.backend.domain.docs.dto.response;

import com.example.backend.domain.common.enums.TemplateEnums.BlockType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocsBlocksResponseDTO {
    private Long id; // 작업문서 블록 PK
    private BlockType blockType; // 블록 타입
    private int page; // 작업문서에서 현재 페이지
    private int docsOrder; // 블록 안의 순서
    private String contents; // 내용
    private String style; // 스타일
}
