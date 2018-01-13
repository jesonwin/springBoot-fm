package com.yuxin.fm.Admin.Dao.Impl;

import com.yuxin.fm.Admin.Dao.AdminDao;
import com.yuxin.fm.Admin.Model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AdminDaoImpl implements AdminDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Admin admin) {
        String sql="insert into admin(userName,password,phone,email,roleNo,roleName,departId,departName,state,createTime,deleted) values(?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,admin.getUserName(),admin.getPassword(),admin.getPhone(),admin.getEmail(),admin.getRoleNo(),admin.getRoleName(),admin.getDepartId(),admin.getDepartName(),admin.getState(),admin.getCreateTime(),admin.getDeleted());
    }

    @Override
    public int delete(String id) {
        String sql="update admin set deleted=1 where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int update(Admin admin) {
        String sql="insert into admin(userName,password,phone,email,roleNo,roleName,departId,departName,state,createTime,deleted) values(?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,admin.getUserName(),admin.getPassword(),admin.getPhone(),admin.getEmail(),admin.getRoleNo(),admin.getRoleName(),admin.getDepartId(),admin.getDepartName(),admin.getState(),admin.getCreateTime(),admin.getDeleted());
    }

    @Override
    public Map<String, Object> selectById(String id) {
        String sql="select * from admin where id = ?";
        return jdbcTemplate.queryForMap(sql,id);
    }
}
