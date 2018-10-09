package com.sms.springboot.employeeservicesh2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.springboot.employeeservicesh2.model.Employee;
import com.sms.springboot.employeeservicesh2.service.EmployeeService;

@RestController
public class EmployeeRestController {
    @Autowired
 private EmployeeService employeeService;
 
 public void setEmployeeService(EmployeeService employeeService) {
  this.employeeService = employeeService;
 }

 @GetMapping("/api/employees")
 public List<Employee> getEmployees() {
  List<Employee> employees = employeeService.retrieveEmployees();
  return employees;
 }
 
 @GetMapping("/api/employees/{employeeId}")
 public Employee getEmployee(@PathVariable("employeeId")Long employeeId) {
  return employeeService.getEmployee(employeeId);
 }
 
 @PostMapping("/api/employees")
 public void saveEmployee(Employee employee){
  employeeService.saveEmployee(employee);
  System.out.println("Employee Saved Successfully");
 }
 
 @DeleteMapping("/api/employees/{employeeId}")
 public void deleteEmployee(@PathVariable("employeeId")Long employeeId){
  employeeService.deleteEmployee(employeeId);
  System.out.println("Employee Deleted Successfully");
 }
 
 @PutMapping("/api/employees/{employeeId}")
 public void updateEmployee(@RequestBody Employee employee,
   @PathVariable("employeeId")Long employeeId){
  Employee emp = employeeService.getEmployee(employeeId);
  if(emp != null){
   employeeService.updateEmployee(employee);
  }
  
 }
}
