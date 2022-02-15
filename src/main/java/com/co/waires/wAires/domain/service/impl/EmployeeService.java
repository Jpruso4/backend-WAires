package com.co.waires.wAires.domain.service.impl;

import com.co.waires.wAires.domain.dto.EmployeeDTO;
import com.co.waires.wAires.domain.mapper.IEmployeeMapper;
import com.co.waires.wAires.domain.service.IEmployeeService;
import com.co.waires.wAires.persistence.entity.Employee;
import com.co.waires.wAires.persistence.repository.IEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private final IEmployeeMapper employMapper;
    private final IEmployeeRepository employRepository;

    public EmployeeService(IEmployeeMapper employMapper, IEmployeeRepository employRepository) {
        this.employMapper = employMapper;
        this.employRepository = employRepository;
    }

    public EmployeeDTO getEmployById(String cedula) {
        Employee employee = employRepository.findById(cedula).orElseThrow(() -> new RuntimeException("El id del empleado no fue encontrado"));
        return employMapper.mapFromEntity(employee);
    }

    @Override
    public List<EmployeeDTO> getEmploys() {
        return employMapper.mapListEmployees(employRepository.findAll());
    }

    @Override
    public EmployeeDTO createEmploy(EmployeeDTO employDTO) {
        return employMapper.mapFromEntity(employRepository.save(employMapper.mapFromDTO(employDTO)));
    }

    @Override
    public EmployeeDTO modifiedEmploy(EmployeeDTO employDTO) {
        Employee employee = employMapper.mapFromDTO(employDTO);
        employRepository.findById(employee.getCedula()).orElseThrow(() -> new RuntimeException("El id del empleado no existe"));
        return employMapper.mapFromEntity(employRepository.save(employee));
    }

    @Override
    public String deleteEmploy(String cedula) {
        employRepository.findById(cedula).orElseThrow(() -> new RuntimeException("El id del empleado no existe"));
        employRepository.deleteById(cedula);
        return "El empleado fue eliminado con exito";
    }
}
