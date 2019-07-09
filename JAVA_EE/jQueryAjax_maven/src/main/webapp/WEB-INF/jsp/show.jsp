<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/25
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页展示</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <style>
        div {
            float: left;
            margin: 10px;
        }

        div dd {
            margin: 0px;
            font-size: 10pt;
        }

        div dd.dd_name {
            color:lightgoldenrodyellow;
        }

        div dd.dd_city {
            color: coral;
        }

    </style>
    <script>
        $(function(){
            $.get("/jQueryAjax_maven/IndexJSON",function (data) {
                $.each(data,function(i,value){
                    var html="<div><dl><dt>"
                        +"<a href='details.html?id'"+value.id+"'>"
                        +"<img src='images/"+value.picture+"' width='140' height='160'>"
                        +"</dt>"
                        +"<dd class='dd_name'"+value.name+"</dd>"
                        +"<dd class='dd_city'>产地:"+value.city+"&nbsp;&nbsp;价格:"+value.price+"</dd>"
                        +"</dl>" +
                        "</div>";
                    $("center table td").append(html);
                });
            },"json");
        })
    </script>

</head>
<body>
<center>
<h1>商品目录</h1>
<hr />
    <table width="780" height="60" cellpadding="0" cellspacing="0" border="0">
        <tr>
            <td>
            </td>
        </tr>
    </table>
</center>
</body>
</html>
