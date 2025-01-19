package com.example.backend.domain.docs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.domain.docs.entity.DocsEntity;

@Repository
public interface DocsRepository extends JpaRepository<DocsEntity, Long> {

}
