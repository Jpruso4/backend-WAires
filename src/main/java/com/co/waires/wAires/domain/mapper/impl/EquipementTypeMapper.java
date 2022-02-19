package com.co.waires.wAires.domain.mapper.impl;


import com.co.waires.wAires.domain.dto.EquipementTypeDTO;
import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.domain.mapper.IEquipementTypeMapper;
import com.co.waires.wAires.domain.mapper.IMarkMapper;
import com.co.waires.wAires.persistence.entity.EquipementType;
import com.co.waires.wAires.persistence.entity.Mark;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class EquipementTypeMapper implements IEquipementTypeMapper {


    @Override
    public EquipementTypeDTO mapFromEntity(EquipementType equipementType) {
        EquipementTypeDTO equipementTypeDTO = new EquipementTypeDTO();
        equipementTypeDTO.setIdTipoEquipo(equipementType.getIdTipoEquipo());
        equipementTypeDTO.setTipoEquipo(equipementType.getTipoEquipo());

        return equipementTypeDTO;
    }

    @Override
    public EquipementType mapFromDTO(EquipementTypeDTO equipementTypeDTO) {
        EquipementType equipementType = new EquipementType();
        equipementType.setIdTipoEquipo(equipementTypeDTO.getIdTipoEquipo());
        equipementType.setTipoEquipo(equipementTypeDTO.getTipoEquipo());
        return equipementType;
    }

    @Override
    public List<EquipementTypeDTO> mapListMarks(List<EquipementType> listEquipementsTypes) {
        List<EquipementTypeDTO> list = new LinkedList<>();
        for (EquipementType equipementType : listEquipementsTypes){
            list.add(mapFromEntity(equipementType));
        }
        return list;
    }
}
