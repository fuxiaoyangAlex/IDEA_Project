<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/15
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    上传人：<input id="name" type="text" name="name">
    请选择图片：<input id="file" type="file" name="imgFile" multiple="multiple"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
