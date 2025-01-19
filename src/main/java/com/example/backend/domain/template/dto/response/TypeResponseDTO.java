package com.example.backend.domain.template.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeResponseDTO { // 서버 -> 클라
    private Long id; // 템플릿 PK
    private String name; // 타입 이름
}
