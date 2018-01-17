package com.yuxin.fm.Admin.Dao.Impl;

import com.yuxin.fm.Admin.Dao.EmployeeDao;
import com.yuxin.fm.Admin.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Employee employee) {
        return 0;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public Map<String, Object> selectById(String id) {
        return null;
    }
}
