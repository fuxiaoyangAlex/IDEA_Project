<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/15
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片接收</title>
</head>
<body>
上传人：${name}<br>
图片：<br/>
<c:forEach items="${myImageList}" var="myImage">
    <img src="${pageContext.request.contextPath}/upload/${myImage}"
         width="100" height="100"/>
</c:forEach>
</body>
</html>
