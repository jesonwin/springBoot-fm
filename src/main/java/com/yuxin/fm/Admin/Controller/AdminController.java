package com.yuxin.fm.Admin.Controller;

import com.yuxin.fm.Admin.Model.Admin;
import com.yuxin.fm.Admin.Service.AdminService;
import com.yuxin.fm.core.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

   /* @RequiresRoles(value = {"spadmin"})*/
    @RequestMapping(value = "/admin/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String,Object> addAdmin(@RequestBody Admin admin) throws Exception {
        admin.setPassword(MD5Utils.encrypt(admin.getPassword()));
        return adminService.add(admin);
    }
    /* @RequiresRoles(value = {"spadmin"})*/
    @RequestMapping(value = "/admin/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String,Object> getByAdmin(@PathVariable("id") String id) throws Exception {
        System.out.println(adminService.getById(id));
        return adminService.getById(id);
    }
}
