<%-- 
    Document   : login
    Created on : Jan 9, 2026, 1:24:49 PM
    Author     : truon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MainController" method="post">
            Username : <input type="text" name="txtUse"></br>
            Password : <input type="text" name="txtPass"></br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
