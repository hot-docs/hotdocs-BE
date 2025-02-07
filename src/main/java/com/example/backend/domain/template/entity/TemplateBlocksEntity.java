package com.example.backend.domain.template.entity;

import com.example.backend.domain.template.entity.TemplateEnums.BlockType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "template_blocks")
public class TemplateBlocksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 템플릿 블록 PK

    // 블록 n개 : 템플릿 1개
    @ManyToOne
    @JoinColumn(name = "template_id", nullable = false)
    private TemplateEntity templateEntity; // 템플릿 Entity

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private BlockType blockType; // 블록 타입

    @Column
    @NotNull
    private int page; // 템플릿에서 현재 페이지

    @Column(name = "template_order")
    @NotNull
    private int templateOrder; // 블록 안의 순서

    @Column
    private String contents; // 내용

    @Column
    private String style; // 스타일
}
