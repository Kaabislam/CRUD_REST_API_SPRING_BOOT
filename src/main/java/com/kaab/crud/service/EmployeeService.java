package com.kaab.crud.service;

import com.kaab.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>findall();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
