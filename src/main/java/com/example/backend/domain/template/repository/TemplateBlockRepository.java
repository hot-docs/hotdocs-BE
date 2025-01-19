package com.example.backend.domain.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.domain.template.entity.TemplateBlocksEntity;

@Repository
public interface TemplateBlockRepository extends JpaRepository<TemplateBlocksEntity, Long> {

}
