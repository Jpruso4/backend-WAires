package com.co.waires.wAires.domain.service.impl;

import com.co.waires.wAires.domain.dto.DocumentTypeDTO;
import com.co.waires.wAires.domain.mapper.IDocumentTypeMapper;
import com.co.waires.wAires.domain.service.IDocumentTypeService;
import com.co.waires.wAires.persistence.repository.IDocumentTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentTypeService implements IDocumentTypeService {

    private final IDocumentTypeMapper documentTypeMapper;
    private final IDocumentTypeRepository documentTypeRepository;

    public DocumentTypeService(IDocumentTypeMapper documentTypeMapper, IDocumentTypeRepository documentTypeRepository) {
        this.documentTypeMapper = documentTypeMapper;
        this.documentTypeRepository = documentTypeRepository;
    }

    @Override
    public List<DocumentTypeDTO> getDocumentType() {
        return documentTypeMapper.mapListDocumentType(documentTypeRepository.findAll());
    }
}
