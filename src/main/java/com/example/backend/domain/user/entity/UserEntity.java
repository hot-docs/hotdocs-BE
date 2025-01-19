package com.example.backend.domain.user.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.example.backend.domain.user.entity.UserEnums.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 회원 PK

    @Column
    private String email; // 회원 이메일

    @Column
    @NotNull
    private String passward; // 회원 비밀번호

    @Column
    @NotNull
    private String name; // 회원 이름

    @Column(name = "social_id")
    private String socialId; // 소셜 아이디

    @Column
    @NotNull
    private Provider provider = Provider.SELF; // 로그인 카테고리

    @Column
    @NotNull
    private Role role = Role.GUEST; // 회원 역할

    @Column(name = "created_date", nullable = false)
    @CreatedDate
    private LocalDateTime createdDateTime = LocalDateTime.now(); // 가입 일자

}
