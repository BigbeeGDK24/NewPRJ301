<%-- 
    Document   : index
    Created on : Jan 8, 2026, 4:08:18 PM
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
        <form action="MainController" method="get">
        a : <input type="text" name="txtA"></br>
        b : <input type="text" name="txtB"><br/><!-- comment -->
        
        <select name="txtOption">
            <option value="+">+</option><!-- comment -->
            <option value="-">-</option>        
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <input type="submit" value="Submit">
        </form>
    </body>
</html>
