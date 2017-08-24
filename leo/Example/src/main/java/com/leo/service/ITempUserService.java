package com.leo.service;

import com.leo.entity.TempUser;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-24 12:49
 */
public interface ITempUserService {

    void addUser(TempUser tempUser);

    void deleteUser(String userId);
    TempUser queryUserById(String userId);

    TempUser queryUserByUserNameAndPasswd(String username,String password);

    List<TempUser> queryAll();

}
