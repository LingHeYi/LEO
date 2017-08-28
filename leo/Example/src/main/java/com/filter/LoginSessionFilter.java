package com.filter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class LoginSessionFilter extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        String actionName = actionInvocation.getProxy().getActionName();
        String method = actionInvocation.getProxy().getMethod();
        ActionContext context = actionInvocation.getInvocationContext();
        Map<String, Object> session = context.getSession();
        Object object = session.get("userId");
        if (null == object || object.equals("")){
            return "login";
        }else {
            return actionInvocation.invoke();
        }
    }
}
