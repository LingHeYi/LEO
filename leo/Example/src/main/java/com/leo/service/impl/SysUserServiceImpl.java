package com.leo.service.impl;

import com.common.Constant;
import com.leo.dao.SysUserMapper;
import com.leo.dao.impl.SysUserDaoImpl;
import com.leo.entity.SysUser;
import com.leo.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-25 15:13
 */
@Service
@Transactional
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserDaoImpl sysUserDao;

    public SysUser queryUserByLoginNameAndPasswd(String loginName, String password) {
        SysUser sysUser = new SysUser();
        sysUser.setLoginName(loginName);
        sysUser.setPassword(password);
        return sysUserDao.querySysUserBase(sysUser);
    }

    public SysUser queryUserByMobile(String mobile) {
        SysUser sysUser = new SysUser();
        sysUser.setMobile(mobile);
        return sysUserDao.querySysUserBase(sysUser);
    }
}
