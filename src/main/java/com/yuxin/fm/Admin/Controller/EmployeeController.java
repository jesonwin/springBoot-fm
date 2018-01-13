package com.yuxin.fm.Admin.Controller;


import com.yuxin.fm.Admin.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController{

    @Autowired
    private EmployeeService employeeService;
}
