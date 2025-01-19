package com.example.backend.global.mapper;

import com.example.backend.domain.docs.dto.request.DocsBlocksRequestDTO;
import com.example.backend.domain.docs.dto.response.DocsBlocksResponseDTO;
import com.example.backend.domain.docs.entity.DocsBlocksEntity;
import com.example.backend.domain.docs.entity.DocsEntity;

public class DocsBlocksMapper {

    // DTO -> Entity
    // 작업문서 블럭 등록
    public DocsBlocksEntity toEntity(DocsBlocksRequestDTO.DocsBlocksAddDTO requestDTO, DocsEntity docsEntity) {
        DocsBlocksEntity entity = new DocsBlocksEntity();
        entity.setDoscEntity(docsEntity);
        entity.setBlockType(requestDTO.getBlockType());
        entity.setPage(requestDTO.getPage());
        entity.setDocsOrder(requestDTO.getDocsOrder());
        entity.setContents(requestDTO.getContents());
        entity.setStyle(requestDTO.getStyle());

        return entity;
    }

    // 작업문서 블럭 수정
    public DocsBlocksEntity toEntity(DocsBlocksRequestDTO.DocsBlocksUpdateDTO requestDTO, DocsEntity docsEntity) {
        DocsBlocksEntity entity = new DocsBlocksEntity();
        entity.setId(requestDTO.getId());
        entity.setDoscEntity(docsEntity);
        entity.setBlockType(requestDTO.getBlockType());
        entity.setPage(requestDTO.getPage());
        entity.setDocsOrder(requestDTO.getDocsOrder());
        entity.setContents(requestDTO.getContents());
        entity.setStyle(requestDTO.getStyle());

        return entity;
    }

    // Entity -> DTO
    public DocsBlocksResponseDTO toDTO(DocsBlocksEntity entity) {
        DocsBlocksResponseDTO responseDTO = new DocsBlocksResponseDTO();
        responseDTO.setId(entity.getId());
        responseDTO.setBlockType(entity.getBlockType());
        responseDTO.setPage(entity.getPage());
        responseDTO.setDocsOrder(entity.getDocsOrder());
        responseDTO.setContents(entity.getContents());
        responseDTO.setStyle(entity.getStyle());

        return responseDTO;
    }

}
