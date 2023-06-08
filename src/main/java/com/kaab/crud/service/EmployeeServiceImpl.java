package com.kaab.crud.service;

import com.kaab.crud.dao.EmployeeDA0;
import com.kaab.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDA0 employeeDA0;
    @Autowired
    public  EmployeeServiceImpl(EmployeeDA0 theEmployeeDAO){

        employeeDA0 = theEmployeeDAO;
    }
    @Override
    public List<Employee> findall() {
        return employeeDA0.findall();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDA0.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDA0.save(theEmployee);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDA0.deleteById(theId);
    }

}
