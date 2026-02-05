<%-- 
    Document   : search
    Created on : Jan 28, 2026, 7:26:43 PM
    Author     : truon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
    <jsp:include page="welcome.jsp"/>

    <c:if test="${empty sessionScope.user}">
        <c:redirect url="login.jsp"/>
    </c:if>
    
    <c:if test="${not empty user}">
        <form action="MainController" method="post">
            <input type="hidden" name="action" value="search">
            Name to searching : <input type="text" name="keyword" value="${keyword}"><!-- comment -->
            <input type="submit" value="Search"><!-- comment -->
        </form>
        <hr/>

        <c:if test="${empty list}">
            NO DATA MATCHING THE SEARCH FOUND !    
        </c:if>

        <c:if test="${not empty list}">
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Short Name</th>
                        <th>City</th>
                        <th>Region</th>
                        <th>Type</th>
                        <th>Founded Year</th>
                        <th>Students</th> 
                        <th>Faculties</th>
                        <th></th>
                    </tr>
                </thead>

                <c:forEach items="${list}" var="u">
                    <tr>
                        <td>${u.id}</td>
                        <td>${u.name}</td>
                        <td>${u.shortName}</td><!-- comment -->
                        <td>${u.city}</td>
                        <td>${u.region}</td>
                        <td>${u.type}</td>
                        <td>${u.foundedYear}</td>
                        <td>${u.totalStudents}</td>
                        <td>${u.totalFaculties}</td>
                        <td>
                            <c:if test="${u.isDraft}">
                                <input type="submit" value="Update">
                            </c:if>
                        </td>
                        <td>
                            <form action="MainController" method="post"
                                  onsubmit="return confirm('Bạn có chắc muốn xóa trường đại học này không ?');">
                                <input type="hidden" name="action" value="deleteUniversity">
                                <input type="hidden" name="id" value="${u.id}">
                                <input type="hidden" name="keyword" value="${keyword}">
                                <input type="submit" value="Delete">
                            </form>
                        </td>
                    </tr>
                </c:forEach> 
            </table>
            </c:if>
        </c:if>
    </body>
</html>
