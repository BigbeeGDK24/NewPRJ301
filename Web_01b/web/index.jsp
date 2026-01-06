<%-- 
    Document   : index
    Created on : Jan 5, 2026, 8:17:50 PM
    Author     : truon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTML Forms</title>
    </head>
    <body>
        
        <h1>HTML Forms</h1>
        <From action ="index.html">
            Textbox <input type = "text" name = "txtText" value = ""><br><!--Nhap text box-->
            Password <input type = "password" name = "txtPassword" value = ""><br>
            Hidden <input type = "hidden" name ="txtHidden" value = ""><br> 
            Male <input type = "checkbox" name = "genderCheck" value = "male"><br>
            
            Status<br>
            Single <input type = "radio" name = "Status" value = "single"><br> 
            Married <input type = "radio" name = "Status" value = "married"><br> 
            Divorsed <input type = "radio" name = "Status" value = "divorsed"><br> 
            
            ComboBox
            <select name = "txtComboBox">
                <option>JPS and Servlet</option>
                <option>EJB</option>
            </select><br>
            
            Mutiple
            <select name = "txtList" size = "3">
                <option>JPS and Servlet</option>
                <option>EJB</option>
                <option>Core Java</option>
            </select>
            <br>
            
            TextArea 
            <textarea name = "txtArea" rows = "4" cols = "25">
            this is a form parameters demo!!!!
            </textarea>
            <br>
            
            <input type = "submit" name = "SubmitQuery" value = "Submit Query">
            <input type = "submit" name = "Register" value = "Register">
            <input type = "reset" name = "action" value = "Reset">
            <input type = "button" name = "txt" value = "JavaScript">
        </From>
   
    </body>
</html>
