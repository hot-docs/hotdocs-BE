package com.example.backend.domain.user.dto.response;

import java.time.LocalDateTime;

import com.example.backend.domain.user.entity.UserEnums.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO { // 서버 -> 클라
    private Long id; // 화원 PK
    private String email; // 회원 이메일
    private String passward; // 회원 비밀번호
    private String name; // 회원 이름
    private String socialId; // 소셜 아이디
    private Provider provider; // 로그인 카테고리
    private Role role; // 회원 역할
    private LocalDateTime createdDateTime; // 가입 일자
}
