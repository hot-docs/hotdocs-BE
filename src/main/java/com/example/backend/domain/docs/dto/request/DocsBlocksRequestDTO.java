package com.example.backend.domain.docs.dto.request;

import com.example.backend.domain.common.enums.TemplateEnums.BlockType;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class DocsBlocksRequestDTO { // 클라 -> 서버

    // 작업문서 등록
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DocsBlocksAddDTO {
        @NotBlank(message = "블록 타입은 필수입니다.")
        private BlockType blockType;

        @NotBlank(message = "작업문서 페이지는 필수입니다.")
        private int page;

        @NotBlank(message = "블록 순서는 필수입니다.")
        private int docsOrder;

        private String contents;
        private String style;
    }

    // 템플릿 수정
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DocsBlocksUpdateDTO {
        @NotBlank(message = "블록 PK는 필수입니다.")
        private Long id;

        @NotBlank(message = "블록 타입은 필수입니다.")
        private BlockType blockType;

        @NotBlank(message = "작업문서 페이지는 필수입니다.")
        private int page;

        @NotBlank(message = "블록 순서는 필수입니다.")
        private int docsOrder;

        private String contents;
        private String style;
    }
}
