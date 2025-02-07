package com.example.backend.domain.user.entity;

import com.example.backend.domain.template.entity.TemplateEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wish")
public class WishEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 찜하기 PK

    @ManyToOne
    @JoinColumn(name = "template_id", nullable = false)
    private TemplateEntity templateEntity; // 템플릿 Entity

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userEntity; // 사용자 Entity

}
