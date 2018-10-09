package com.sms.springboot.employeeservicesh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.springboot.employeeservicesh2.model.Employee;

@Repository
public interface  EmployeeRepository extends JpaRepository<Employee,Long>{

}
