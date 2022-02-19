package com.co.waires.wAires.domain.service;

import com.co.waires.wAires.domain.dto.EquipementTypeDTO;

import java.util.List;

public interface IEquipementTypeService {

    EquipementTypeDTO getEquipementTypeById(Integer id);

    List<EquipementTypeDTO> getEquipementTypes();

    EquipementTypeDTO createEquipementType(EquipementTypeDTO equipementTypeDTO);

    EquipementTypeDTO modifiedEquipementType(EquipementTypeDTO equipementTypeDTO);

    String deleteEquipementType(Integer id);
}
