<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/6/5
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
　　
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            font-size: 12px;
        }
        #messages {
            height: 250px;
            border: 1px solid;
            padding: 5px;
            overflow: auto;
        }
        #wrapper {
            margin: auto;
            width: 438px;
        }
    </style>
    <script>
        function createMessages(){
            $.ajax({
                url: "${pageContext.request.contextPath}/insert.action",
                type: "post",
                data: $("#chatForm").serialize(),
                dataType:"POST",
                success :function (data) {
                    if(data=="OK"){
                        alert("确认发送信息!");
                        window.location.reload();
                    }else {
                        return false;
                    }
                }
            })
        }

    </script>
</head>
<body>
<div id="wrapper">
    <p id="messages">
        <c:forEach var="list" items="${listMessages}">
            <tr>
                <td>${list.user}:</td>
                <td>${list.msg}</td>
            </tr>
            <br/>
        </c:forEach>
    </p>

    <form id="chatForm" action="#">
        姓名：
        <input type="text" id="user" name="user" size="50"/>
        <br />
        内容：
        <input type="text" id="msg"  name="msg" size="50"/>
        <br />
        <input type="button" value="提交" onclick="createMessages()">
        <br />
    </form>
</div>
</body>
</html>
