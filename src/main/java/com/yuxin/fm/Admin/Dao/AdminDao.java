package com.yuxin.fm.Admin.Dao;

import com.yuxin.fm.Admin.Model.Admin;

import java.util.Map;

public interface AdminDao {
    public int insert(Admin admin);
    public int delete(String id);
    public int update(Admin admin);
    public Map<String,Object> selectById(String id);
}
