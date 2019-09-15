package com.allensun.mapper;

import com.allensun.pojo.Admin;

public interface AdminMapper {
    /**用户登录系统
     * @MethodName: login
     * @Author: AllenSun
     * @Date: 2019/9/12 21:40
     */
    Admin login(String a_name);

    /**用户注册账号
     * @MethodName: insert
     * @Author: AllenSun
     * @Date: 2019/9/12 21:40
     */
    void insert(Admin admin);

    /**根据用户名称查找用户信息，然后获得密码进行检验
     * @MethodName: findByName
     * @Author: AllenSun
     * @Date: 2019/9/12 21:40
     */
    Admin findByName(String a_name);
}
