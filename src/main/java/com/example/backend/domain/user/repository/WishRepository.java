package com.example.backend.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.domain.user.entity.WishEntity;

public interface WishRepository extends JpaRepository<WishEntity, Long> {

}
