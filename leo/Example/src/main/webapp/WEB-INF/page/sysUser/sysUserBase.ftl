<#--<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld"] /> --><#--这一句是为了让Freemarker识别struts2的标签 -->

　　　　　　　　　　　　<#--struts-tags.tld ，如果没有此文件，则在模板中，就不能使用 Struts2 的标签了，但可以使用 Freemarker 的语言下的标签 -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>测试 Freemarker 的页面</title>

</head>


<body>
this is the testing Freemarker's page!

<h1>${(sysUser.realName)!}你好</h1>

</body>
</html>