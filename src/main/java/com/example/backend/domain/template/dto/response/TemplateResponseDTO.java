package com.example.backend.domain.template.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateResponseDTO { // 서버 -> 클라
    private Long id; // 템플릿 PK
    private Long userId; // 회원 PK
    private String userName; // 회원 이름
    private Long typeId; // 타입 PK
    private String tilte; // 템플릿 이름
    private Boolean agree; // 관리자 게시 승인 여부
    private List<TemplateBlocksResponseDTO> blocksDTOList; // 블록 Entity 리스트
}
