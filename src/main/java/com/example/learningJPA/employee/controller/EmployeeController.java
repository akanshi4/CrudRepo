package com.example.learningJPA.employee.controller;

import com.example.learningJPA.employee.model.Employee;
import com.example.learningJPA.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public void createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

    @RequestMapping(value="/employees" , method=RequestMethod.GET)
    public List<Employee> getEmployees(){
        List<Employee> employees= employeeService.getEmployees();
        return employees;
    }

    @RequestMapping(value="/employees/{id}", method=RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id){
        System.out.println("Employee's Id: "+ id);
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value="/employees/{id}", method=RequestMethod.DELETE)
    public void deleteEmployeeById(@PathVariable("id") int id){
        employeeService.deleteEmployeeById(id);
    }


}
