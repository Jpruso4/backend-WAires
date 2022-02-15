package com.co.waires.wAires.domain.mapper;


import com.co.waires.wAires.domain.dto.EmployeeDTO;
import com.co.waires.wAires.persistence.entity.Employee;

import java.util.List;

public interface IEmployeeMapper {

    EmployeeDTO mapFromEntity(Employee employee);

    Employee mapFromDTO(EmployeeDTO employDTO);

    List<EmployeeDTO> mapListEmployees(List<Employee> listEmployee);
}
