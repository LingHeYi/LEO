package com.leo.dao.impl;

import com.leo.dao.SysUserMapper;
import com.leo.entity.SysUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-25 15:15
 */
@Repository
public class SysUserDaoImpl implements SysUserMapper{

    //注入seqsession对象
    @Autowired
    @Qualifier("sqlSession")
    private SqlSessionTemplate sqlSessionTemplate;

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(SysUser record) {
        return 0;
    }

    public int insertSelective(SysUser record) {
        return 0;
    }

    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    public SysUser selectByPrimaryKey(String id) {
        return null;
    }

    public SysUser querySysUserBase(SysUser sysUser){
        return sqlSessionTemplate.selectOne("SysUserMapper.querySysUserBase",sysUser);
    }
}
