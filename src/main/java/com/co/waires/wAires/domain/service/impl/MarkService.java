package com.co.waires.wAires.domain.service.impl;

import com.co.waires.wAires.domain.dto.MarkDTO;
import com.co.waires.wAires.domain.mapper.IMarkMapper;
import com.co.waires.wAires.domain.service.IMarkService;

import com.co.waires.wAires.persistence.entity.Client;
import com.co.waires.wAires.persistence.entity.Mark;
import com.co.waires.wAires.persistence.repository.IMarkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService implements IMarkService {

    private final IMarkMapper markMapper;
    private final IMarkRepository markRepository;

    public MarkService(IMarkMapper markMapper, IMarkRepository markRepository) {
        this.markMapper = markMapper;
        this.markRepository = markRepository;
    }

    @Override
    public MarkDTO getMarkById(Integer id) {
        Mark mark = markRepository.findById(String.valueOf(id)).orElseThrow(() -> new RuntimeException("El id del empleado no fue encontrado"));
        return markMapper.mapFromEntity(mark);
    }

    @Override
    public List<MarkDTO> getMarks() {
        List<Mark> listMarks = markRepository.findAll();
        return markMapper.mapListMarks(listMarks);
    }

    @Override
    public MarkDTO createMark(MarkDTO markDTO) {
        return markMapper.mapFromEntity(markRepository.save(markMapper.mapFromDTO(markDTO)));
    }

    @Override
    public MarkDTO modifiedMark(MarkDTO markDTO) {
        Mark mark = markMapper.mapFromDTO(markDTO);
        markRepository.findById(String.valueOf(mark.getIdMarca())).orElseThrow(() -> new RuntimeException("El id del empleado no existe"));
        return markMapper.mapFromEntity(markRepository.save(mark));
    }

    @Override
    public String deleteMark(Integer id) {
        markRepository.findById(String.valueOf(id)).orElseThrow(() -> new RuntimeException("El id del empleado no existe"));
        markRepository.deleteById(String.valueOf(id));
        return "El empleado fue eliminado con exito";
    }
}
