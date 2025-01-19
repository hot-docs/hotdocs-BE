package com.example.backend.domain.user.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.domain.user.repository.UserRepository;

@Service
public class UserAccountService {
    @Autowired
    private UserRepository userRepository;
}
