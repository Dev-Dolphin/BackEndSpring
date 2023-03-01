package com.example.springbootController;


import com.example.springbootModel.Employee;
import com.example.springbootRepository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employee
    @GetMapping("/employee")
    public List<Employee> getAllEmloyees() {
        return employeeRepository.findAll();
    }

}
