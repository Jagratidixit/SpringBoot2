package com.example.SpringBoot2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String empName = "John Doe";

    @Autowired
    private DepartmentBean department;  // Dependency Injection

    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department.getDeptName());
    }
}
