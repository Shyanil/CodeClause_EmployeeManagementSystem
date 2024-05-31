package com.example.EmployeeManagementSystem.Controller;

import com.example.EmployeeManagementSystem.Model.Employee;
import com.example.EmployeeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/em")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee member) {
        return employeeService.saveEmployee(member);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/{id}")
    private Optional<Employee> getAllEmployeeId(@PathVariable Long id){
       return employeeService.getAllEmployeeId(id);
    }

}
