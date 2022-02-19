package com.co.waires.wAires.domain.service;

import com.co.waires.wAires.domain.dto.MarkDTO;

import java.util.List;

public interface IMarkService {

    MarkDTO getMarkById(Integer idMarca);

    List<MarkDTO> getMarks();

    MarkDTO createMark(MarkDTO markDTO);

    MarkDTO modifiedMark(MarkDTO markDTO);

    String deleteMark(Integer idMarca);
}
