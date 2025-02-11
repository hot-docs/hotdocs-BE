package com.example.backend.domain.template.entity;

import java.util.List;

import com.example.backend.domain.user.entity.UserEntity;
import com.example.backend.domain.user.entity.WishEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "template")
public class TemplateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 템플릿 PK

    // 템플릿 n개 : 사용자 1명
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userEntity; // 회원 Entity

    // 템플릿 n개 : 타입 1개
    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private TypeEntity typeEntity; // 타입 Entity

    @Column
    @NotNull
    private String title; // 템플릿 이름

    @Column
    private Boolean agree = false; // 관리자 게시 승인 여부

    // 템플릿 1개 : 블록 n개
    @OneToMany(mappedBy = "templateEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<TemplateBlocksEntity> blocksEntityList; // 블록 Entity 리스트

    // 템플릿 1개 : 찜하기 n개
    @OneToMany(mappedBy = "templateEntity")
    private List<WishEntity> wishEntityList; // 찜하기 리스트
}
