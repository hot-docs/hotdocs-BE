package com.example.backend.domain.docs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.domain.docs.entity.DocsBlocksEntity;

@Repository
public interface DocsBlocksRepository extends JpaRepository<DocsBlocksEntity, Long> {

}
