package com.co.waires.wAires.domain.service;

import com.co.waires.wAires.domain.dto.ClientDTO;
import com.co.waires.wAires.domain.dto.EmployeeDTO;

import java.util.List;

public interface IEmployeeService {
    
    EmployeeDTO getEmployById(int cedula);

    List<EmployeeDTO> getEmploys();

    EmployeeDTO createEmploy(EmployeeDTO employDTO);

    EmployeeDTO modifiedEmploy(EmployeeDTO employDTO);

    EmployeeDTO deleteEmploy(int cedula);
}

