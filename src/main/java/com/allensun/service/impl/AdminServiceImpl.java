package com.allensun.service.impl;

import com.allensun.mapper.AdminMapper;
import com.allensun.pojo.Admin;
import com.allensun.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AdminServiceImpl
 * @Author: AllenSun
 * @Date: 2019/9/12 21:46
 */
@Service
public class AdminServiceImpl implements AdminService {

    /**
     * 注入service层
     */
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 登录的功能
     *
     * @param a_name 输入的用户名
     * @return 返回查询到的该用户名对应的密码
     */
    @Override
    public Admin login(String a_name) {
        return adminMapper.login(a_name);
    }

    /**
     * 注册功能
     *
     * @param admin 注册的信息
     * @return 返回影响的行数
     */
    @Override
    public void insert(Admin admin) {
        adminMapper.insert(admin);
    }

    /**
     * 根据用户名查询
     *
     * @param a_name 用户名
     * @return 返回影响的行数
     */
    @Override
    public Admin findByName(String a_name) {
        return adminMapper.findByName(a_name);
    }
}
