package com.leo.action;

import com.leo.entity.SysUser;
import com.leo.service.ISysUserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-25 15:46
 */
@Controller
@Scope("prototype")
public class SysUserAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Autowired(required=true)
    private ISysUserService sysUserService;

    private SysUser sysUser;

    public String queryUserByLoginNameAndPasswd(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        SysUser sysUser = sysUserService.queryUserByLoginNameAndPasswd(loginName,password);
        return SUCCESS;
    }
    public String queryUserByMobile(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String mobile = request.getParameter("mobile");
        sysUser = sysUserService.queryUserByMobile(mobile);
        return SUCCESS;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }
}
