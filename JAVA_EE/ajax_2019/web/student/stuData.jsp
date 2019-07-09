<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/17
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection connection ;
    Statement stmt;
    ResultSet rs ;
%>

<%
    String URL = "jdbc:mysql://localhost:3306/ajax?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String DRIVER = "com.mysql.jdbc.Driver";
    String USERNAME = "root";
    String PASSWORD = "123456";

    try {
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql = "select * from student where id=";
        String stu = request.getParameter("stucode");
        int stuid = Integer.parseInt(stu);
        sql+=stuid;
        stmt = connection.createStatement();
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
            String name = rs.getString(2);
            String className = rs.getString(3);

            out.println("<?xml version='1.0' encoding='UTF-8'?>");
            out.println("<student>");
            out.println("<name>"+name+"</name>");
            out.println("<classname>"+className+"</classname>");
            out.println("</student>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
