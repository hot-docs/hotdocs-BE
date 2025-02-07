package com.example.backend.global.mapper;

import org.springframework.stereotype.Component;

import com.example.backend.domain.template.dto.request.TemplateRequestDTO;
import com.example.backend.domain.template.dto.response.TemplateResponseDTO;
import com.example.backend.domain.template.entity.TemplateEntity;
import com.example.backend.domain.template.entity.TypeEntity;
import com.example.backend.domain.user.entity.UserEntity;

@Component
public class TemplateMapper {

    // DTO -> Entity
    // 작업문서 등록
    public TemplateEntity toEntity(TemplateRequestDTO.TemplateAddDTO requestDTO, UserEntity userEntity,
            TypeEntity typeEntity) {
        TemplateEntity entity = new TemplateEntity();
        entity.setUserEntity(userEntity);
        entity.setTypeEntity(typeEntity);
        entity.setTilte(requestDTO.getTilte());

        return entity;
    }

    // 작업문서 수정
    public TemplateEntity toEntity(TemplateRequestDTO.TemplateUpdateDTO requestDTO, TypeEntity typeEntity) {
        TemplateEntity entity = new TemplateEntity();
        entity.setId(requestDTO.getId());
        entity.setTypeEntity(typeEntity);
        entity.setTilte(requestDTO.getTilte());

        return entity;
    }

    // Entity -> DTO
    public TemplateResponseDTO toDTO(TemplateEntity entity) {
        TemplateResponseDTO responseDTO = new TemplateResponseDTO();
        responseDTO.setId(entity.getId());
        responseDTO.setUserId(entity.getUserEntity().getId());
        responseDTO.setUserName(entity.getUserEntity().getName());
        responseDTO.setTypeId(entity.getTypeEntity().getId());
        responseDTO.setTilte(entity.getTilte());
        responseDTO.setAgree(entity.getAgree());

        return responseDTO;
    }

}
