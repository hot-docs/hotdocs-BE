package com.example.backend.domain.docs.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocsResponseDTO { // 서버 -> 클라
    private Long id; // 작업문서 PK
    private Long userId; // 회원 PK
    private String userName; // 회원 이름
    private Long typeId; // 타입 PK
    private String tilte; // 작업 문서 이름
    private Boolean bookmark; // 내 문서 즐겨찾기
    private LocalDateTime updatedDateTime = LocalDateTime.now(); // 수정 일자
    private LocalDateTime createdDateTime = LocalDateTime.now(); // 가입 일자
    private List<DocsBlocksResponseDTO> blocksEntityList; // 블록 Entity 리스트
}
