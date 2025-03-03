package com.example.SpringBoot2.beans;


import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName = "Software Development";

    public String getDeptName() {
        return deptName;
    }
}
