package com.yuxin.fm.Admin.Service;

import com.yuxin.fm.Admin.Model.Admin;
import com.yuxin.fm.Admin.Model.Employee;

import java.util.Map;

public interface EmployeeService {
    public Map<String,Object> add(Employee employee);
    public Map<String,Object> deleteById(String id);
    public Map<String,Object> update(Employee employee);
    public Map<String,Object> getById(String id);
}
