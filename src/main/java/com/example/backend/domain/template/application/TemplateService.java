package com.example.backend.domain.template.application;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.backend.domain.template.dto.response.TemplateResponseDTO;
import com.example.backend.domain.template.dto.response.TypeResponseDTO;
import com.example.backend.domain.template.repository.TemplateRepository;
import com.example.backend.domain.template.repository.TemplateSpecification;
import com.example.backend.domain.template.repository.TypeRepository;
import com.example.backend.global.mapper.TemplateMapper;
import com.example.backend.global.mapper.TypeMapper;
import com.example.backend.domain.template.entity.TemplateEntity;
import com.example.backend.domain.template.entity.TypeEntity;

@Service
public class TemplateService {
    @Autowired
    private TemplateRepository templateRepository;

    @Autowired
    private TypeRepository typeRepository;

    @Autowired
    private TemplateMapper templateMapper;

    @Autowired
    private TypeMapper typeMapper;

    // 25.02.06 템플릿 목록 출력 - uj
    public Map<String, Object> getTemplateList(Map<String, Object> mapData) {
        Map<String, Object> map = new HashMap<>();

        // 1. 설정 값 추출
        Pageable pageable = (Pageable) mapData.get("pageable");
        int type = Integer.parseInt(mapData.get("type").toString());
        int sortby = Integer.parseInt(mapData.get("sortby").toString());
        String query = null;
        if (mapData.get("query") != null)
            query = mapData.get("query").toString();

        // 2. 상품 추출
        List<TemplateResponseDTO> list = new LinkedList<>();
        // Agree = true
        Specification<TemplateEntity> templateSpec = Specification.where(TemplateSpecification.hasAgree(true));

        if (type != 0) { // 타입이 존재하는 경우
            templateSpec = templateSpec.and(TemplateSpecification.equalType(Long.parseLong(type + "")));
        }
        if (query != null) { // 검색어가 존재하는 경우
            templateSpec = templateSpec.and(TemplateSpecification.hasTitleContaining(query));
        }
        if (sortby == 1) { // 인기순 정렬
            templateSpec = templateSpec.and(TemplateSpecification.orderByWishSizeDesc());
        }

        // 3. Entity -> DTO 변환
        for (TemplateEntity entity : templateRepository.findAll(templateSpec, pageable)) {
            list.add(templateMapper.toDTO(entity));
        }

        // 4. 반환값 저장
        map.put("list", list);
        map.put("pageable", pageable);
        map.put("type", getType());

        return map;
    }

    // 25.02.07 - 타입 목록 가져오기 - uj
    public List<TypeResponseDTO> getType() {
        List<TypeResponseDTO> list = new LinkedList<>();
        for (TypeEntity entity : typeRepository.findAll()) {
            list.add(typeMapper.toDTO(entity));
        }
        return list;
    }
}
