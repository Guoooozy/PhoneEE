<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/2
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加好友</title>
</head>
<body>
<a href="Show.jsp">查看好友</a>
<a href="Add.jsp">添加好友</a>
<form action="Add" method="post">
    姓名<input type="text" name="name"><br>
    电话<input type="text" name="tel"><br>
    家庭住址<input type="text" name="add"><br>
    <input type="submit" value="提交"/>
    <input type="Reset" value="重置">
</form>
</body>
</html>
