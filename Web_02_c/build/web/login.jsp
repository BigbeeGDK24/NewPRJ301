<%-- 
    Document   : login
    Created on : Jan 8, 2026, 4:45:32 PM
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
        <<form action="MainController" method="post">
            Username : <input type="text" name="txtUser"><br/><!-- comment -->
            Password : <input type="text" name="txtPass"<br/>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
