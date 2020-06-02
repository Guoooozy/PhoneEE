<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/2
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看好友</title>
</head>
<body>
<a href="Show.jsp">查看好友</a>
<a href="Add.jsp">添加好友</a>
<table>
    <tr>
        <td>姓名</td>
        <td>电话</td>
        <td>家庭住址</td>
    </tr>
    <c:forEach var="s" items="${list}" >
        <tr align="center">
            <td>${s.name}</td>
            <td>${s.tel}</td>
            <td>${s.add}</td>
            <td><a href="">更改</a></td>
            <td><a href="">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
