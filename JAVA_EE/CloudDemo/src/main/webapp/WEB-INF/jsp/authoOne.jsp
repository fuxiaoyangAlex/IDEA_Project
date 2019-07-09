<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + path + "/";
%>


<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/6/12
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<font style="font-size:15px" face="宋体">
    CloudDemo用户后台管理系统
</font>
<a style="float: right" href="${pageContext.request.contextPath}/logout.action">退出登陆</a>

<div id="page-wrapper">
            <h1 class="page-header">管理操作系统</h1>
</div>

<form class="form-inline" method="get" action="${pageContext.request.contextPath}/findAllUser.action">
    <button type="submit" class="btn btn-primary">查询</button>
</form>

<button type="button" class="btn btn-primary btn-lg" style="color: rgb(212, 106, 64);">
    <span class="glyphicon glyphicon-user" href="#" class="btn btn-primary" data-toggle="modal"
          data-target="#newUserDialog" onclick="clearCustomer()">新建用户信息</span>
</button>

<table class="table table-striped">
    <thead>
    <tr>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>用户联系方式</th>
        <th>用户密码</th>
        <th>用户邮箱</th>
        <th>用户签名</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${userList}">
    <tr>
        <td>${user.userId}</td>
        <td>${user.userName}</td>
        <td>${user.userPhone}</td>
        <td>${user.userPassword}</td>
        <td>${user.userEmail}</td>
        <td>${user.userSignature}</td>
        <td>
        <td>
            <a href="#" class="btn btn-danger btn-xs"
               onclick="deleteUser(${user.userId})">删除</a>

            <a href="#" class="btn btn-primary btn-xs" data-toggle="modal"
               data-target="#myModal"
               onclick="editUser(${user.userId})">
                修改</a>
        </td>
        </c:forEach>
    </tbody>
</table>

<%--用于客户的增加的模态框--%>
<div class="modal fade" id="newUserDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel2">新建用户信息:</h4>
            </div>
            <div class="modal-body">
                <form id="createUser_form">
                    <div class="form-group">
                        <label for="new_username">用户名:</label>
                        <input type="text" placeholder="用户名" id="new_username" name="userName"
                               class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="new_phone">用户联系方式:</label>
                        <input type="text" placeholder="联系方式" id="new_phone" name="userPhone"
                               class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="new_password">用户登陆密码:</label>
                        <input type="text" placeholder="密码" id="new_password" name="userPassword"
                               class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="new_email">用户邮箱:</label>
                        <input type="text" placeholder="密码" id="new_email" name="userEmail"
                               class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label for="new_signature">用户签名:</label>
                        <input type="text" placeholder="密码" id="new_signature" name="userSignature"
                               class="form-control"/>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">
                    关闭
                </button>
                <button type="button" class="btn btn-primary" onclick="createUser()">
                    创建客户
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>

<script>
    function editUser(id) {
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/findCustomerById",
            data: {"id": id},
            success: function (data) {
                $("#id").val(data.id);
                $("#username").val(data.username);
                $("#job").val(data);
                $("#phone").val(data.phone);
            }
        })
    }

    function updateCustomer() {
        //用于修改客户信息
        $.get(
            "${pageContext.request.contextPath}/updateCustomer", $("#createUser_form").serialize(), function (data) {
                if (data == "OK") {
                    alert("修改成功!");
                    window.location.reload();
                } else {
                    alert("修改失败!");
                    window.location.reload();
                }
            }
        )
    }

    function clearUser() {
        $("#new_username").val("");
        $("#new_phone").val("");
        $("#new_password").val();
        $("#new_email").val("");
        $("#new_signature").val("");
    }

    //创建用户
    function createUser() {
        $.get(
            "${pageContext.request.contextPath}/insertUser",$("#createUser_form").serialize(), function (data) {
                if (data == "OK") {
                    alert("客户创建成功！");
                    window.location.reload();
                } else {
                    alert("客户创建失败！");
                    window.location.reload();
                }
            }
        )
    }

//    删除用户
</script>
<script type="text/javascript">
    function deleteUser(id) {
        if(confirm('确定要删除用户吗？')){
            $.post("${pageContext.request.contextPath}/delete.action",{"id":id},function (data) {
                if (data =="OK"){
                    alert("成功删除!");
                    window.location.reload();
                }else{
                    alert("删除失败!")
                    window.location.reload();
                }
            })
        }
    }
</script>
</body>
</html>
