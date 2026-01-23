<%-- 
    Document   : search
    Created on : Jan 23, 2026, 11:57:25 AM
    Author     : truon
--%>

<%@page import="model.UniversityDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% UserDTO user = (UserDTO) session.getAttribute("user");
            if (user != null) {
                String keyword = request.getAttribute("keyword") + "";
                keyword = (keyword.equals("null") ? "" : keyword);
                ArrayList<UniversityDTO> list = new ArrayList<UniversityDTO>();
                if (request.getAttribute("list") != null) {
                    list = (ArrayList<UniversityDTO>) request.getAttribute("list");
                }

        %>
        <form action="MainController" method="post">
            <input type="hidden" name="action" value="search">
            Name to Searching : <input type="text" name="keyword" value="<%=keyword%>">;
            <input type="submit" value="search">
        </form>
        <hr/>
        <table border='1'>
        <thead>
            <th>Id</th>
            <th>Name</th>
            <th>Short Name</th>
            <th>City</th>
            <th>Region</th>
            <th>Type</th>
            <th>Founded Year</th>
            <th>Total Students</th>
            <th>Faculties</th>
        </thead>
        <%
            if (list.size() == 0) {
        %>
        No matching data the search found!
        <%
        } else {
            for (UniversityDTO u : list) {
        %>
        <tr>
            <td><%=u.getId()%></td>
            <td><%=u.getName()%></td>
            <td><%=u.getShortName()%></td>
            <td><%=u.getCity()%></td>
            <td><%=u.getRegion()%></td>
            <td><%=u.getType()%></td>
            <td><%=u.getFoundedYear()%></td>
            <td><%=u.getTotalStudents()%></td>
            <td><%=u.getTotalFaculties()%></td>
       
        <td>
            <input type="submit" value="Update"
                   style="display: <%=u.isIsDraft() ? "block" : "none"%>" ><!-- comment -->
        </td> 
        </tr>
        <%
                }
            }
        %>
    </table>
    <%
        } else {
            String url = "login.jsp";
            response.sendRedirect(url);
        }
    %>
</body>
</html>
