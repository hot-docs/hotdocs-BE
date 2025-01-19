package com.example.backend.domain.docs.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import com.example.backend.domain.template.entity.TypeEntity;
import com.example.backend.domain.user.entity.UserEntity;

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
@Table(name = "docs")
public class DocsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 작업문서 PK

    // 작업 문서 n개 : 사용자 1명
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userEntity;

    // 작업 문서 n개 : 타입 1개
    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private TypeEntity typeEntity; // 타입 Entity

    @Column
    @NotNull
    private String tilte; // 작업 문서 이름

    @Column
    @NotNull
    private Boolean bookmark = false; // 내 문서 즐겨찾기

    @Column(name = "updated_date", nullable = false)
    @CreatedDate
    private LocalDateTime updatedDateTime; // 수정 일자

    @Column(name = "created_date", nullable = false)
    @CreatedDate
    private LocalDateTime createdDateTime; // 생성 일자

    // 작업문서 1개 : 블록 n개
    @OneToMany(mappedBy = "doscEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<DocsBlocksEntity> blocksEntityList; // 블록 Entity 리스트
}
