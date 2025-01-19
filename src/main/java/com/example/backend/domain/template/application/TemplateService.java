package com.example.backend.domain.template.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.domain.template.repository.TemplateRepository;

@Service
public class TemplateService {
    @Autowired
    private TemplateRepository templateRepository;
}
