package com.yuxin.fm.Admin.Service.Impl;

import com.yuxin.fm.Admin.Dao.EmployeeDao;
import com.yuxin.fm.Admin.Model.Employee;
import com.yuxin.fm.Admin.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class EmployeeServiceImpl implements EmployeeService{
   @Autowired
   private EmployeeDao employeeDao;

   @Override
   public Map<String, Object> add(Employee employee) {
      return null;
   }

   @Override
   public Map<String, Object> deleteById(String id) {
      return null;
   }

   @Override
   public Map<String, Object> update(Employee employee) {
      return null;
   }

   @Override
   public Map<String, Object> getById(String id) {
      return null;
   }
}
