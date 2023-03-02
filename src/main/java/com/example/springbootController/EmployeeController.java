package com.example.springbootController;


import com.example.springbootModel.Employee;
import com.example.springbootRepository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employee
    @CrossOrigin
    @GetMapping("/employee")
    public List<Employee> getAllEmloyee() {
        return employeeRepository.findAll();
    }

}
