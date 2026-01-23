<%-- 
    Document   : a
    Created on : Jan 23, 2026, 11:39:56 AM
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
        <h1>Hello Your World's <%=user.getFullName()%></h1>
        <h2>Can you go with me to travel around your world !!!!!!!</h2>
        <a href="MainController?action=logout">Logout</a>
        <a href="search.jsp">Search</a>
        <%
            }else{
                    String url = "login.jsp";
                    response.sendRedirect(url);
                    }
        %>
    </body>
</html>
