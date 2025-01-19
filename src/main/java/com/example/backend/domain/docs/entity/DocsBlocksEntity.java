package com.example.backend.domain.docs.entity;

import com.example.backend.domain.common.enums.TemplateEnums.BlockType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "docs_blocks")
public class DocsBlocksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 작업문서 블록 PK

    // 작업문서 1개 : 블록 n개
    @ManyToOne
    @JoinColumn(name = "docs_id", nullable = false)
    private DocsEntity doscEntity; // 작업문서 Entity

    @Column
    @NotNull
    private BlockType blockType; // 블록 타입

    @Column
    @NotNull
    private int page; // 작업문서에서 현재 페이지

    @Column(name = "docs_order")
    @NotNull
    private int docsOrder; // 블록 안의 순서

    @Column
    private String contents; // 내용

    @Column
    private String style; // 스타일
}
