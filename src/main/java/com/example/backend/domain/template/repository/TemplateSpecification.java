package com.example.backend.domain.template.repository;

import org.springframework.data.jpa.domain.Specification;

import com.example.backend.domain.template.entity.TemplateEntity;

public class TemplateSpecification {
    // 25.02.10 agree 조건 - uj
    public static Specification<TemplateEntity> hasAgree(Boolean agree) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("agree"), agree);
    }

    // 25.02.10 type 종류 - uj
    public static Specification<TemplateEntity> equalType(Long type_id) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("typeEntity").get("id"), type_id);
    }

    // 25.02.10 title 검색 - uj
    public static Specification<TemplateEntity> hasTitleContaining(String title) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(title), "%" + title + "%");
    }

    // 25.02.10 wish개수 내림차순 - uj
    public static Specification<TemplateEntity> orderByWishSizeDesc() {
        return (root, query, criteriaBuilder) -> {
            query.orderBy(criteriaBuilder.desc(criteriaBuilder.size(root.get("wishEntityList"))));
            return null;
        };
    }
}
