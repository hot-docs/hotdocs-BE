package com.example.backend.domain.template.dto.request;

import com.example.backend.domain.template.entity.TemplateEnums.BlockType;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TemplateBlocksRequestDTO { // 클라 -> 서버

    // 템플릿 등록
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TemplateBlockAddDTO {
        @NotBlank(message = "블록 타입은 필수입니다.")
        private BlockType blockType;

        @NotBlank(message = "템플릿 페이지는 필수입니다.")
        private int page;

        @NotBlank(message = "블록 순서는 필수입니다.")
        private int templateOrder;

        private String contents;
        private String style;
    }

    // 템플릿 수정
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TemplateBlockUpdateDTO {
        @NotBlank(message = "블록 PK는 필수입니다.")
        private Long id;

        @NotBlank(message = "블록 타입은 필수입니다.")
        private BlockType blockType;

        @NotBlank(message = "템플릿 페이지는 필수입니다.")
        private int page;

        @NotBlank(message = "블록 순서는 필수입니다.")
        private int templateOrder;

        private String contents;
        private String style;
    }
}
