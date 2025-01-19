package com.example.backend.domain.common.mapper;

import com.example.backend.domain.user.dto.request.UserRequestDTO;
import com.example.backend.domain.user.dto.response.UserResponseDTO;
import com.example.backend.domain.user.entity.UserEntity;

public class UserMapper {

    // DTO -> Entity
    // 회원가입
    public UserEntity toEntity(UserRequestDTO.UserSignUpDTO requestDTO) {
        UserEntity entity = new UserEntity();
        entity.setEmail(requestDTO.getEmail());
        entity.setPassward(requestDTO.getPassward());
        entity.setName(requestDTO.getName());
        entity.setSocialId(requestDTO.getSocialId());
        entity.setProvider(requestDTO.getProvider());
        entity.setRole(requestDTO.getRole());
        entity.setCreatedDateTime(requestDTO.getCreatedDateTime());

        return entity;
    }

    // 로그인
    public UserEntity toEntity(UserRequestDTO.UserSignInDTO requestDTO) {
        UserEntity entity = new UserEntity();
        entity.setEmail(requestDTO.getEmail());
        entity.setPassward(requestDTO.getPassward());

        return entity;
    }

    // Entity -> DTO
    // 회원 정보
    public UserResponseDTO toDTO(UserEntity entity) {
        UserResponseDTO responseDTO = new UserResponseDTO();
        responseDTO.setId(entity.getId());
        responseDTO.setEmail(entity.getEmail());
        responseDTO.setPassward(entity.getPassward());
        responseDTO.setName(entity.getName());
        responseDTO.setSocialId(entity.getSocialId());
        responseDTO.setProvider(entity.getProvider());
        responseDTO.setRole(entity.getRole());
        responseDTO.setCreatedDateTime(entity.getCreatedDateTime());

        return responseDTO;
    }

}
