package com.co.waires.wAires.domain.mapper;


import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.persistence.entity.Mark;

import java.util.List;

public interface IMarkMapper {

    MarkDTO mapFromEntity(Mark mark);

    Mark  mapFromDTO(MarkDTO markDTO);

    List<MarkDTO> mapListMarks(List<Mark> listMark);
}
