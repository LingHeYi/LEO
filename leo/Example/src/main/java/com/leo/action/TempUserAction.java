package com.leo.action;

import com.leo.entity.TempUser;
import com.leo.service.ITempUserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunlei
 * @create 2017-08-24 12:54
 */
@Controller
@Scope("prototype")
public class TempUserAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Autowired(required=true)
    private ITempUserService tempUserService;

    private TempUser tempUser;

    private List<TempUser> userList;

    public String addUser (){
        tempUserService.addUser(tempUser);
        return SUCCESS;
    }

    public String deleteUser (){
        tempUserService.deleteUser(tempUser.getId());
        return SUCCESS;
    }


    public String queryUserById(){
        tempUserService.queryUserById(tempUser.getId());
        return SUCCESS;
    }

    public String queryUserByUserNameAndPasswd() {
//        tempUser = tempUserService.queryUserByUserNameAndPasswd(tempUser.getUsername(),tempUser.getPassword());
        tempUser = new TempUser();
        tempUser.setId("20170824001");
        tempUser.setUsername("sunlei");
        return SUCCESS;
    }

    public String queryAll() {
        userList = tempUserService.queryAll();
        return "list";
    }
    public TempUser getTempUser() {
        return tempUser;
    }

    public void setTempUser(TempUser tempUser) {
        this.tempUser = tempUser;
    }

    public List<TempUser> getUserList() {
        return userList;
    }

    public void setUserList(List<TempUser> userList) {
        this.userList = userList;
    }
}
