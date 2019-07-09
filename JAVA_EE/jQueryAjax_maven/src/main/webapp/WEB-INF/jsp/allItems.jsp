<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/24
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table class="table table-hover">
    <caption>商品获取情况</caption>
    <thead>
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>城市</th>
        <th>价格</th>
        <th>数量</th>
        <th>图片</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${items}">
        <tr>
            <td id="${item.id }" >${item.id }</td>
            <td id="${item.name }" >${item.name }</td>
            <td id="${item.city }" >${item.city }</td>
            <td id="${item.price }" >${item.price }</td>
            <td id="${item.number }" >${item.number}</td>
            <td id="${item.picture }">${item.picture }</td>
        </tr>
    </c:forEach>

    </tbody>

</table>
</body>
</html>
