<%-- 
    Document   : myprofile
    Created on : Dec 16, 2015, 4:28:32 PM
    Author     : cb-vishal
--%>
<%@page import="pack.*"%>
<%
    User obj=UserDao.getUser(session.getAttribute("uemail").toString(),session.getAttribute("pass").toString());
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>First Name: <%=obj.getFname()%> </h1>
        <h3>Last Name: <%=obj.getLname()%> </h1>
        <h3>Email: <%=obj.getUemail()%> </h1>
        <h3>Password: <%=obj.getUpass()%> </h1>
    </body>
</html>
