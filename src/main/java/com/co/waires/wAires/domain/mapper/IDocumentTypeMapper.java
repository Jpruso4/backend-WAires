package com.co.waires.wAires.domain.mapper;


import com.co.waires.wAires.domain.dto.DocumentTypeDTO;
import com.co.waires.wAires.persistence.entity.DocumentType;

import java.util.List;

public interface IDocumentTypeMapper {

    DocumentTypeDTO mapFromEntity(DocumentType documentType);

    List<DocumentTypeDTO> mapListDocumentType(List<DocumentType> listDocumentType);

}
