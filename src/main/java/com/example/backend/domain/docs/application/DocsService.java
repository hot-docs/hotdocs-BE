package com.example.backend.domain.docs.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.domain.docs.repository.DocsBlocksRepository;
import com.example.backend.domain.docs.repository.DocsRepository;

@Service
public class DocsService {

    @Autowired
    private DocsRepository docsRepository;

    @Autowired
    private DocsBlocksRepository blocksRepository;

}
