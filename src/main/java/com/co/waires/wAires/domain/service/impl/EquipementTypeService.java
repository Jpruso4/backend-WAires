package com.co.waires.wAires.domain.service.impl;

import com.co.waires.wAires.domain.dto.EquipementTypeDTO;
import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.domain.mapper.IEquipementTypeMapper;
import com.co.waires.wAires.domain.mapper.IMarkMapper;
import com.co.waires.wAires.domain.service.IEquipementTypeService;
import com.co.waires.wAires.persistence.entity.EquipementType;
import com.co.waires.wAires.persistence.entity.Mark;
import com.co.waires.wAires.persistence.repository.IEquipementTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipementTypeService implements IEquipementTypeService {

    private final IEquipementTypeMapper iEquipementTypeMapper;
    private final IEquipementTypeRepository equipementTypeRepository;

    public EquipementTypeService(IEquipementTypeMapper iEquipementTypeMapper, IEquipementTypeRepository equipementTypeRepository) {
        this.iEquipementTypeMapper = iEquipementTypeMapper;
        this.equipementTypeRepository = equipementTypeRepository;
    }

    @Override
    public EquipementTypeDTO getEquipementTypeById(Integer id) {
        EquipementType equipementType = equipementTypeRepository.findById(String.valueOf(id)).orElseThrow(() -> new RuntimeException("El id del empleado no fue encontrado"));
        return iEquipementTypeMapper.mapFromEntity(equipementType);
    }

    @Override
    public List<EquipementTypeDTO> getEquipementTypes() {
        List<EquipementType> listMarks = equipementTypeRepository.findAll();
        return iEquipementTypeMapper.mapListMarks(listMarks);
    }

    @Override
    public EquipementTypeDTO createEquipementType(EquipementTypeDTO equipementTypeDTO) {
        return iEquipementTypeMapper.mapFromEntity(equipementTypeRepository.save(iEquipementTypeMapper.mapFromDTO(equipementTypeDTO)));
    }

    @Override
    public EquipementTypeDTO modifiedEquipementType(EquipementTypeDTO equipementTypeDTO) {
        EquipementType equipementType = iEquipementTypeMapper.mapFromDTO(equipementTypeDTO);
        equipementTypeRepository.findById(String.valueOf(equipementType.getIdTipoEquipo())).orElseThrow(() -> new RuntimeException("El id del empleado no existe"));
        return iEquipementTypeMapper.mapFromEntity(equipementTypeRepository.save(equipementType));
    }

    @Override
    public String deleteEquipementType(Integer id) {
        equipementTypeRepository.findById(String.valueOf(id)).orElseThrow(() -> new RuntimeException("El id del empleado no existe"));
        equipementTypeRepository.deleteById(String.valueOf(id));
        return "El empleado fue eliminado con exito";
    }
}
