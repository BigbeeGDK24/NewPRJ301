<%-- 
    Document   : a
    Created on : Jan 19, 2026, 3:18:11 PM
    Author     : truon
--%>

<%@page import="model.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserDTO user = (UserDTO) session.getAttribute("user");
            if (user != null) {
        %>   
        Welcome to your HOME's <%=user.getFullName()%>
        <h1>Bang Dieu Khien</h1>
        Bang dieu khien 1</br>
        Bang dieu khien 2</br><!-- comment -->
        Bang dieu khien 3</br>
        <a href="MainController?action=logout">Logout</a>
        <%
            } else {
            response.sendRedirect("login.jsp");
            }
        %>
        
    </body>
</html>
