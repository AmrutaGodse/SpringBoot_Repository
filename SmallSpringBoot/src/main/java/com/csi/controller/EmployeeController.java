package com.csi.controller;

import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/showmsg")
    public String showMsg()
    {
        return "Welcome to Spring Application";
    }

    @GetMapping("/java")
    public String javaMsg()
    {
        return "Full Stack Java Developer";
    }
}
