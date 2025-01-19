package com.example.backend.domain.common.enums;

public class UserEnums { // 사용자 테이블 Enum
    // 로그인 카테고리
    public enum Provider {
        NAVER, GOOGLE, SELF
    }

    // 역할
    public enum Role {
        GUEST, USER, DESIGNER, ADMIN
    }
}
