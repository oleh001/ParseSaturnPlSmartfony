<%@ page import="controller.Controller" %>
<%@ page import="configuration.Configure" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.07.2016
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Controller controller = new Controller();
    Configure configure = Configure.getConfigure();
%>
<!DOCTYPE HTML>
<html>
<head>
    <style type="text/css">
        <%@include file="css/style.css" %>
    </style>
    <title><%out.println(configure.getTitle());%></title>
    <link href="images/logotyp.ico" type="image/x-icon" rel="icon">
</head>
<body>
<table width="75%" class="tableProd" border="0" cellspacing="0" cellpadding="0">
    <tbody>
    <tr class="head">
        <td class="head-prod">№</td>
        <td class="head-prod">Product</td>
        <td class="head-prod">Price</td>
    </tr>
    <%
        int i = 1;
        for (Map.Entry<String, String> ma : controller.getMapa().entrySet()) {
            out.println("<tr class='notauth1'>");
            out.println("<td class='body-numbe'>" + i + "</td>");
            out.println("<td class='body-prod'>" + ma.getKey() + "</td>");
            out.println("<th class='body-price'>" + ma.getValue() + "</th>");
            out.println("</tr>");
            i++;
        }
    %>
    </tbody>
</table>
</body>
</html>
