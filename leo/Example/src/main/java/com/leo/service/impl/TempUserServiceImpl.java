package com.leo.service.impl;

import com.leo.dao.ITempUserDao;
import com.leo.entity.TempUser;
import com.leo.service.ITempUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-24 12:50
 */
@Service
@Transactional
public class TempUserServiceImpl implements ITempUserService {

    @Autowired
    @Qualifier("tempUserDao")
    private ITempUserDao tempUserDao;

    public void addUser(TempUser tempUser) {
        tempUserDao.addUser(tempUser);
    }

    public void deleteUser(String userId) {
        tempUserDao.delUser(userId);
    }

    public TempUser queryUserById(String userId) {
        return tempUserDao.queryUserById(userId);
    }

    public TempUser queryUserByUserNameAndPasswd(String username, String password) {
        return tempUserDao.queryUserByUserNameAndPasswd(username,password);
    }

    public List<TempUser> queryAll() {
        return tempUserDao.queryAll();
    }
}
