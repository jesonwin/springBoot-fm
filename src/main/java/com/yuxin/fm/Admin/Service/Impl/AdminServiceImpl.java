package com.yuxin.fm.Admin.Service.Impl;

import com.yuxin.fm.Admin.Dao.AdminDao;
import com.yuxin.fm.Admin.Model.Admin;
import com.yuxin.fm.Admin.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminDao adminDao;

    @Override
    public Map<String, Object> add(Admin admin) {
        return null;
    }

    @Override
    public Map<String, Object> deleteById(String id) {
        return null;
    }

    @Override
    public Map<String, Object> update(Admin admin) {
        return null;
    }

    @Override
    public Map<String, Object> getById(String id) {
        Map<String,Object> admin = adminDao.selectById(id);
        return admin;
    }
}
