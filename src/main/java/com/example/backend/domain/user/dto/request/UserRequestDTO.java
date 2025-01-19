package com.example.backend.domain.user.dto.request;

import java.time.LocalDateTime;

import com.example.backend.domain.common.enums.UserEnums.*;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserRequestDTO { // 클라 -> 서버

    // 회원가입
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserSignUpDTO {
        @NotBlank(message = "이메일은 필수입니다.")
        @Email(message = "올바른 이메일 형식이어야 합니다.")
        private String email;

        @NotBlank(message = "비밀번호는 필수입니다.")
        private String passward;

        @NotBlank(message = "이름은 필수입니다.")
        private String name;

        private String socialId;

        private Provider provider;
        private Role role;
        private LocalDateTime createdDateTime;
    }

    // 로그인
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserSignInDTO {
        private String email;
        private String passward;
    }

}
