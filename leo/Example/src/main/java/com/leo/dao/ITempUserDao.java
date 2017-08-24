package com.leo.dao;

import com.leo.entity.TempUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-24 12:44
 */
@SuppressWarnings("unchecked")
public interface ITempUserDao {
    public void addUser(TempUser tempUser);

    public void delUser(String userId);

    public TempUser queryUserById(String userId);

    public TempUser queryUserByUserNameAndPasswd(String username,String password);

    public List<TempUser> queryAll();

}
