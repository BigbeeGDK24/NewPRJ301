<%-- 
    Document   : login
    Created on : Jan 26, 2026, 5:50:29 PM
    Author     : truon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MainController" method="post">
            <input type="hidden" name="action" value="login"><!-- comment -->
            Username :  <input type="text" name="txtUsername" ></br>
            Password :  <input type="password" name="txtPassword" ></br>
            <input type="submit" value="Login">
        </form>    
        <c:if test="${not empty message}">
            <span style="color: red" >${message}</span> 
        </c:if>    
    </body>
</html>
