<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 03-08-2023
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    PrintWriter p=response.getWriter();
    Cookie cookie[]=request.getCookies();
    if (!cookie.equals(null)){
        for (int i=0;i<cookie.length;i++){
            p.println(cookie[i].getName() +  cookie[i].getValue() + "<br>" );
        }
    }
%>

<h1>Welcome to Profile</h1>
<form action="logout" method="POST">
    <input type="submit" value="Logout" id="LogoutButton">


</form>

</body>
</html>
