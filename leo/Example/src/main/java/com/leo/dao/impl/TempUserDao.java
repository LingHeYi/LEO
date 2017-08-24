package com.leo.dao.impl;

import com.leo.dao.ITempUserDao;
import com.leo.entity.TempUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-24 14:44
 */
@Repository
public class TempUserDao implements ITempUserDao{

    public void addUser(TempUser tempUser) {

    }

    public void delUser(String userId) {

    }

    public TempUser queryUserById(String userId) {
        return null;
    }

    public TempUser queryUserByUserNameAndPasswd(String username, String password) {
        return null;
    }

    public List<TempUser> queryAll() {
        return null;
    }


}
