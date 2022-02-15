package com.co.waires.wAires.persistence.repository;

import com.co.waires.wAires.persistence.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String> {
}
