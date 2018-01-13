package com.yuxin.fm.Admin.Dao;

import com.yuxin.fm.Admin.Model.Employee;

import java.util.Map;

public interface EmployeeDao {
    public int insert(Employee employee);
    public int deleteById(String id);
    public int update(Employee employee);
    public Map<String,Object> selectById(String id);
}
