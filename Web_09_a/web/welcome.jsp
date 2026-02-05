<%-- 
    Document   : welcome
    Created on : Jan 26, 2026, 6:23:49 PM
    Author     : truon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${not empty sessionScope.user}">
                <h1>Hello World's ${sessionScope.user.fullName}</h1><!-- comment -->
                <h2>Can you go with me to travel around your world !!!!!!!</h2>

                <a href="MainController?action=logout">Logout</a>
                <a href="search.jsp">Search</a> 
                <a href="university_from.jsp">Add</a>
            </c:when>

            <c:otherwise>
                <c:redirect url="login.jsp"/>
            </c:otherwise>
        </c:choose>
    
</body>
</html>
