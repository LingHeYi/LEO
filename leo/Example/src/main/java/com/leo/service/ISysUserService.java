package com.leo.service;

import com.leo.entity.SysUser;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-25 15:12
 */
public interface ISysUserService {

    /**
      * @discription    通过登录名和密码查询用户基本信息
      * @author sunlei
      * @createTime 2017/8/25 15:32
      */
    SysUser queryUserByLoginNameAndPasswd(String loginName, String password);
    /**
      * @discription    通过手机号查询用户基本信息
      * @author sunlei
      * @createTime 2017/8/25 15:32
      */
    SysUser queryUserByMobile(String mobile);
}
