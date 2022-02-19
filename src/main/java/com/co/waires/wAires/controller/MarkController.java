package com.co.waires.wAires.controller;

import com.co.waires.wAires.domain.dto.EmployeeDTO;
import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.domain.service.IMarkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarkController {

    private final IMarkService markService;

    public MarkController(IMarkService markService) {
        this.markService = markService;
    }


    @GetMapping("/{idMarca}")
    public ResponseEntity<MarkDTO> getMarkById(@PathVariable ("idMarca") Integer idMarca){
        return new ResponseEntity(markService.getMarkById(idMarca), HttpStatus.OK);
    }

    @GetMapping("/marcas")
    public ResponseEntity<List<MarkDTO>> getMarks(){
        return new ResponseEntity(markService.getMarks(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<MarkDTO> createMark(@RequestBody MarkDTO markDTO){
        return new ResponseEntity(markService.createMark(markDTO), HttpStatus.CREATED);
    }

    @PutMapping("/modified")
    public ResponseEntity<MarkDTO> modifiedMark(@RequestBody MarkDTO markDTO){
        return new ResponseEntity(markService.modifiedMark(markDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idMarca}")
    public ResponseEntity<MarkDTO> deleteEmploy(@PathVariable("idMarca") Integer idMarca){
        return new ResponseEntity(markService.deleteMark(idMarca), HttpStatus.OK);
    }
}
