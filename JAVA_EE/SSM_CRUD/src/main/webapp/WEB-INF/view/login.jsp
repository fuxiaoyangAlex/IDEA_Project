<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/6/6
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>用户登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel="stylesheet" href="css/reset.css" >
    <link rel="stylesheet" href="css/supersized.css">
    <link rel="stylesheet" href="css/style.css">

    <script>
        function check() {
            var usercode=$("#usercode").val();
            var password=$("#password").val();
            if(usercode=="" || password==""){
                $("#message").text("账号或密码不能为空!");
                return false;
            }
            return true;
        }
    </script>

</head>
<body oncontextmenu="return false">
<div class="page-container">
    <h1>Login</h1>
    <font color="#663399">
        <%--提示信息--%>
        <span id="message">${msg}</span>
    </font>

    <form action="${pageContext.request.contextPath}/customer.action"
          method="post" onsubmit="return check()">
        <div>
            <input type="text" name="usercode" id="usercode" placeholder="usercode" />
        </div>
        <div>
            <input type="password" name="password" id="password" placeholder="password"/>
        </div>
        <%--<button id="submit" type="button">Sign in</button>--%>
        <input type="submit" value="Sign in" />
    </form>
    <div class="connect">
        <p>If we can only encounter each other rather than stay with each other,then I wish we had never encountered.</p>
        <p style="margin-top:20px;">如果只是遇见，不能停留，不如不遇见。</p>
    </div>
</div>

<script src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js"
        type="text/javascript"></script>
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>

</body>
</html>
