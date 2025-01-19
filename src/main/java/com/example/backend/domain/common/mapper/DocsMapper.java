package com.example.backend.domain.common.mapper;

import java.time.LocalDateTime;

import com.example.backend.domain.docs.dto.request.DocsRequestDTO;
import com.example.backend.domain.docs.dto.response.DocsResponseDTO;
import com.example.backend.domain.docs.entity.DocsEntity;
import com.example.backend.domain.template.entity.TypeEntity;
import com.example.backend.domain.user.entity.UserEntity;

public class DocsMapper {

    // DTO -> Entity
    // 작업문서 등록
    public DocsEntity toEntity(DocsRequestDTO.DocsAddDTO requestDTO, UserEntity userEntity, TypeEntity typeEntity) {
        DocsEntity entity = new DocsEntity();
        entity.setUserEntity(userEntity);
        entity.setTypeEntity(typeEntity);
        entity.setTilte(requestDTO.getTilte());
        entity.setCreatedDateTime(LocalDateTime.now());

        return entity;
    }

    // 작업문서 수정
    public DocsEntity toEntity(DocsRequestDTO.DocsUpdateDTO requestDTO, TypeEntity typeEntity) {
        DocsEntity entity = new DocsEntity();
        entity.setId(requestDTO.getId());
        entity.setTypeEntity(typeEntity);
        entity.setTilte(requestDTO.getTilte());
        entity.setUpdatedDateTime(LocalDateTime.now());

        return entity;
    }

    // Entity -> DTO
    public DocsResponseDTO toDTO(DocsEntity entity) {
        DocsResponseDTO responseDTO = new DocsResponseDTO();
        responseDTO.setId(entity.getId());
        responseDTO.setUserId(entity.getUserEntity().getId());
        responseDTO.setUserName(entity.getUserEntity().getName());
        responseDTO.setTypeId(entity.getTypeEntity().getId());
        responseDTO.setBookmark(entity.getBookmark());
        responseDTO.setUpdatedDateTime(entity.getUpdatedDateTime());
        responseDTO.setCreatedDateTime(entity.getCreatedDateTime());

        return responseDTO;
    }

}
