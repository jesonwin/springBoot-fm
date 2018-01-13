package com.yuxin.fm.Admin.Service;

import com.yuxin.fm.Admin.Model.Admin;

import java.util.Map;

public interface AdminService {
    public Map<String,Object> add(Admin admin);
    public Map<String,Object> deleteById(String id);
    public Map<String,Object> update(Admin admin);
    public Map<String,Object> getById(String id);
}
