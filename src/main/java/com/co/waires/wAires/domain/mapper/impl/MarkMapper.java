package com.co.waires.wAires.domain.mapper.impl;


import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.domain.mapper.IMarkMapper;
import com.co.waires.wAires.persistence.entity.Mark;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class MarkMapper implements IMarkMapper {

    @Override
    public MarkDTO mapFromEntity(Mark mark) {
        MarkDTO markDTO = new MarkDTO();
        markDTO.setIdMarca(mark.getIdMarca());
        markDTO.setNombreMarca(mark.getNombreMarca());
        return markDTO;
    }

    @Override
    public Mark mapFromDTO(MarkDTO markDTO) {
        Mark mark = new Mark();
        mark.setIdMarca(markDTO.getIdMarca());
        mark.setNombreMarca(markDTO.getNombreMarca());
        return mark;
    }

    @Override
    public List<MarkDTO> mapListMarks(List<Mark> listMark) {
        List<MarkDTO> list = new LinkedList<>();
        for (Mark mark : listMark){
            list.add(mapFromEntity(mark));
        }
        return list;
    }
}
