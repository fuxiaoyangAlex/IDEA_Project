<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/15
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body>

  <form action="${pageContext.request.contextPath}/login" method="POST">
      用户名:<input type="text" name="username" /><br/>
      密&nbsp;&nbsp;&nbsp;码
      <input type="password" name="password" /><br/>
      <input type="submit" value="登陆"><br>
      ${msg}
  </form>
</body>
</html>
