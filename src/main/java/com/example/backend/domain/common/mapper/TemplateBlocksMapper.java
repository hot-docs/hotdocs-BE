package com.example.backend.domain.common.mapper;

import com.example.backend.domain.template.dto.request.TemplateBlocksRequestDTO;
import com.example.backend.domain.template.dto.response.TemplateBlocksResponseDTO;
import com.example.backend.domain.template.entity.TemplateBlocksEntity;
import com.example.backend.domain.template.entity.TemplateEntity;

public class TemplateBlocksMapper {

    // DTO -> Entity
    // 템플릿 블럭 등록
    public TemplateBlocksEntity toEntity(TemplateBlocksRequestDTO.TemplateBlockAddDTO requestDTO,
            TemplateEntity templateEntity) {
        TemplateBlocksEntity entity = new TemplateBlocksEntity();
        entity.setTemplateEntity(templateEntity);
        entity.setBlockType(requestDTO.getBlockType());
        entity.setPage(requestDTO.getPage());
        entity.setTemplateOrder(entity.getTemplateOrder());
        entity.setContents(requestDTO.getContents());
        entity.setStyle(requestDTO.getStyle());

        return entity;
    }

    // 템플릿 블럭 수정
    public TemplateBlocksEntity toEntity(TemplateBlocksRequestDTO.TemplateBlockUpdateDTO requestDTO,
            TemplateEntity templateEntity) {
        TemplateBlocksEntity entity = new TemplateBlocksEntity();
        entity.setId(requestDTO.getId());
        entity.setTemplateEntity(templateEntity);
        entity.setBlockType(requestDTO.getBlockType());
        entity.setPage(requestDTO.getPage());
        entity.setTemplateOrder(entity.getTemplateOrder());
        entity.setContents(requestDTO.getContents());
        entity.setStyle(requestDTO.getStyle());

        return entity;
    }

    // Entity -> DTO
    public TemplateBlocksResponseDTO toDTO(TemplateBlocksEntity entity) {
        TemplateBlocksResponseDTO responseDTO = new TemplateBlocksResponseDTO();
        responseDTO.setId(entity.getId());
        responseDTO.setBlockType(entity.getBlockType());
        responseDTO.setPage(entity.getPage());
        responseDTO.setTemplateOrder(entity.getTemplateOrder());
        responseDTO.setContents(entity.getContents());
        responseDTO.setStyle(entity.getStyle());

        return responseDTO;
    }

}
