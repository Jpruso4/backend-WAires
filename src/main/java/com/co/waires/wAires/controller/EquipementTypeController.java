package com.co.waires.wAires.controller;

import com.co.waires.wAires.domain.dto.EquipementTypeDTO;
import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.domain.service.IEquipementTypeService;
import com.co.waires.wAires.domain.service.IMarkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoEquipo")
public class EquipementTypeController {

    private final IEquipementTypeService equipementTypeService;

    public EquipementTypeController(IEquipementTypeService equipementTypeService) {
        this.equipementTypeService = equipementTypeService;
    }


    @GetMapping("/{idTipoEquipo}")
    public ResponseEntity<EquipementTypeDTO> getEquipementTypeById(@PathVariable ("idMarca") Integer idTipoEquipo){
        return new ResponseEntity(equipementTypeService.getEquipementTypeById(idTipoEquipo), HttpStatus.OK);
    }

    @GetMapping("/tiposEquipos")
    public ResponseEntity<List<EquipementTypeDTO>> getEquipementTypes(){
        return new ResponseEntity(equipementTypeService.getEquipementTypes(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<MarkDTO> createEquipementType(@RequestBody EquipementTypeDTO equipementTypeDTO){
        return new ResponseEntity(equipementTypeService.createEquipementType(equipementTypeDTO), HttpStatus.CREATED);
    }

    @PutMapping("/modified")
    public ResponseEntity<MarkDTO> modifiedMark(@RequestBody EquipementTypeDTO equipementTypeDTO){
        return new ResponseEntity(equipementTypeService.modifiedEquipementType(equipementTypeDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idTipoEquipo}")
    public ResponseEntity<MarkDTO> deleteEmploy(@PathVariable("idTipoEquipo") Integer idTipoEquipo){
        return new ResponseEntity(equipementTypeService.deleteEquipementType(idTipoEquipo), HttpStatus.OK);
    }
}
