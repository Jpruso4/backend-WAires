package com.co.waires.wAires.domain.mapper;


import com.co.waires.wAires.domain.dto.EquipementTypeDTO;
import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.persistence.entity.EquipementType;
import com.co.waires.wAires.persistence.entity.Mark;

import java.util.List;

public interface IEquipementTypeMapper {

    EquipementTypeDTO mapFromEntity(EquipementType equipementType);

    EquipementType  mapFromDTO(EquipementTypeDTO equipementTypeDTO);

    List<EquipementTypeDTO> mapListMarks(List<EquipementType> listEquipementsTypes);
}
