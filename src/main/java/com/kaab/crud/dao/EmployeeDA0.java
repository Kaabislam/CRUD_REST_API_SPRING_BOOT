package com.kaab.crud.dao;

import com.kaab.crud.entity.Employee;

import java.util.List;

public interface EmployeeDA0 {
    List<Employee>findall();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
