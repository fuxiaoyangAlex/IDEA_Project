<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/24
  Time: 9:19
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
    $(function () {
        function parseUrl(url) {
            if(url.indexOf("?")== -1){
                return {};
            }
            var query = url.split("?")[1];
            var queryArr = query.split("&");
            var obj = {};
            queryArr.forEach(function (items) {
                var key = items.split("=")[0];
                var value = parseInt(items.split("=")[1]);
                obj[key] = decodeURIComponent(value);
            });
            return obj
        }
        var urlMsg = parseUrl(window.location.search);
        console.log(window.location.search);
        console.log(urlMsg);

         // $.get("/jQueryAjax_maven/IndexJSON",urlMsg,function (data,textstatus) {
         //     console.log(textstatus);
         // })
        $.ajax({
            url:"/jQueryAjax_maven/getItemsById",
            type:"POST",
            data:urlMsg,
            datatype:"json",
            success:function (data) {
                console.log(data);
                var html="<div><dl><dt>"
                    +"<a href='items.jsp?id'"+data.id+"'>"
                    +"<img src='images/"+data.picture+"' width='140' height='160'>"
                    +"</dt>"
                    +"<dd class='dd_name'"+data.name+"</dd>"
                    +"<dd class='dd_city'>产地:"+data.city+"&nbsp;&nbsp;价格:"+
                        data.price+"</dd>"
                    +"</dl>" +
                    "</div>";
                $("center table td").append(html);
            }
        })
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
