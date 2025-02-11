package com.example.backend.domain.template.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TemplateRequestDTO { // 클라 -> 서버

    // 템플릿 등록
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TemplateAddDTO {
        @NotBlank(message = "사용자 PK는 필수입니다.")
        private Long userId;

        @NotBlank(message = "템플릿 타입PK는 필수입니다.")
        private Long typeId;

        @NotBlank(message = "템플릿 이름은 필수입니다.")
        private String title;
    }

    // 템플릿 수정
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TemplateUpdateDTO {
        @NotBlank(message = "템플릿 PK는 필수입니다.")
        private Long id;

        @NotBlank(message = "템플릿 타입PK는 필수입니다.")
        private Long typeId;

        @NotBlank(message = "템플릿 이름은 필수입니다.")
        private String title;
    }
}
