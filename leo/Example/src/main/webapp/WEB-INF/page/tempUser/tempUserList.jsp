<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="s" uri="/struts-tags" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/24
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
    <table>
        <tr>
            <th>id</th>
            <th>username</th>
            <th>password</th>
        </tr>
        <s:iterator value="#userList" var="user">
            <tr>
                <td><s:property value="#user.id"></s:property> </td>
                <td><s:property value="#user.username"></s:property> </td>
                <td><s:property value="#user.password"></s:property> </td>
            </tr>
        </s:iterator>
        <%--<c:forEach items="userList" varStatus="user">
            <tr>
                <td><c:out value="user.id"></c:out></td>
                <td><c:out value="user.username"></c:out></td>
                <td><c:out value="user.password"></c:out></td>
            </tr>
        </c:forEach>--%>
    </table>
</html>
