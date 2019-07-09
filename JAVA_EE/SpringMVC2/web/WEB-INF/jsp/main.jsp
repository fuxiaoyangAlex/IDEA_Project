<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/15
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统主页</title>
</head>
<body>

 当前用户:${USER_SESSION.username}<br>
 <a href="${pageContext.request.contextPath}/logout ">退出</a>
</body>
</html>
