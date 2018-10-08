package com.example.learningJPA.employee.service;

import com.example.learningJPA.employee.model.Employee;
import com.example.learningJPA.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class EmployeeService  {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee){
        Random random = new Random();

        int id = random.nextInt(100);

        employee.setId(id);

        employeeRepository.save(employee);

    }

    public List<Employee> getEmployees(){
        List<Employee> employees=employeeRepository.findAll();
        return employees;
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findOne(id);
    }

    public void deleteEmployeeById(int id){
        employeeRepository.delete(id);
    }
}
