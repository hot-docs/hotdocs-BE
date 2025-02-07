package com.example.backend.global.mapper;

import org.springframework.stereotype.Component;

import com.example.backend.domain.template.dto.response.TypeResponseDTO;
import com.example.backend.domain.template.entity.TypeEntity;

@Component
public class TypeMapper {
    // Entity -> DTO
    public TypeResponseDTO toDTO(TypeEntity entity) {
        TypeResponseDTO responseDTO = new TypeResponseDTO();
        responseDTO.setId(entity.getId());
        responseDTO.setName(entity.getName());
        return responseDTO;
    }
}
