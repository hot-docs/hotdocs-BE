package com.example.backend.domain.docs.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class DocsRequestDTO { // 클라 -> 서버

    // 작업문서 등록
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DocsAddDTO {
        @NotBlank(message = "사용자 PK는 필수입니다.")
        private Long userId;

        @NotBlank(message = "작업문서 타입PK는 필수입니다.")
        private Long typeId;

        @NotBlank(message = "작업문서 이름은 필수입니다.")
        private String tilte;
    }

    // 작업문서 수정
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DocsUpdateDTO {
        @NotBlank(message = "작업문서 PK는 필수입니다.")
        private Long id;

        @NotBlank(message = "작업문서 타입PK는 필수입니다.")
        private Long typeId;

        @NotBlank(message = "작업문서 이름은 필수입니다.")
        private String tilte;
    }
}
