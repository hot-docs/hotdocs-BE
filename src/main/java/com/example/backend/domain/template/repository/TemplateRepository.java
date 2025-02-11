package com.example.backend.domain.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.backend.domain.template.entity.TemplateEntity;

@Repository
public interface TemplateRepository
                extends JpaRepository<TemplateEntity, Long>, JpaSpecificationExecutor<TemplateEntity> {
}
