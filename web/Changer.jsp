<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Guoooozy
  Date: 2020/6/3
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="Show.jsp">查看好友</a>
<a href="Add.jsp">添加好友</a>
<form action="Change" method="post">
    姓名<input type="text" name="name" value="${param.name}"><br>
    电话<input type="text" name="tel" value="${param.tel}"><br>
    家庭住址<input type="text" name="add" value="${param.add}"><br>
    <input type="submit" value="提交"/>
    <input type="Reset" value="重置">
</form>
</body>
</html>
