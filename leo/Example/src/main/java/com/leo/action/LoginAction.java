package com.leo.action;

import com.leo.entity.SysUser;
import com.leo.service.ISysUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.basic.BasicSliderUI;

public class LoginAction  extends ActionSupport{
    @Autowired(required=true)
    private ISysUserService sysUserService;

    @Override
    public String execute() throws Exception {
        /*HttpServletRequest request = ServletActionContext.getRequest();
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        SysUser sysUser = sysUserService.queryUserByLoginNameAndPasswd(loginName,password);
        if (null != sysUser){
            ActionContext.getContext().getSession().put("userId",sysUser.getId());
            ActionContext.getContext().getSession().put("loginName",sysUser.getLoginName());
            ActionContext.getContext().getSession().put("nickName",sysUser.getNickName());
        }*/
        return SUCCESS;
    }
}
