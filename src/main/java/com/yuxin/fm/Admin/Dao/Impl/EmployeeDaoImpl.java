package com.yuxin.fm.Admin.Dao.Impl;

import com.yuxin.fm.Admin.Dao.EmployeeDao;
import com.yuxin.fm.Admin.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Employee employee) {
        String sql="insert into admin(userName,nickName,password,phone,email,icon,sex,birthday,account,roleNo,roleName,depBriefId,depBriefName,state,createTime,deleted) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,employee.getUserName(),employee.getNickName(),employee.getPassword(),employee.getPhone(),employee.getEmail(),employee.getIcon(),employee.getSex(),employee.getBirthday(),employee.getAccount(),employee.getRoleNo(),employee.getRoleName(),employee.getDepBriefId(),employee.getDepBriefName(),employee.getState(),employee.getCreateTime(),employee.getDeleted());
    }

    @Override
    public int deleteById(String id) {
        String sql="update employee set deleted = 1 where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public Map<String, Object> selectById(String id) {
        String sql = "select * from employee where id = ?";
        return jdbcTemplate.queryForMap(sql,id);
    }
}
