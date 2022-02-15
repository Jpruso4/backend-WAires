package com.co.waires.wAires.controller;

import com.co.waires.wAires.domain.dto.ClientTypeDTO;
import com.co.waires.wAires.domain.service.IDocumentTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("documentType")
public class DocumentTypeController {

    private final IDocumentTypeService documentTypeService;

    public DocumentTypeController(IDocumentTypeService documentTypeService) {
        this.documentTypeService = documentTypeService;
    }

    @GetMapping("/documentsTypes")
    public ResponseEntity<List<ClientTypeDTO>> getProfiles(){
        return new ResponseEntity(documentTypeService.getDocumentType(), HttpStatus.OK);
    }
}
