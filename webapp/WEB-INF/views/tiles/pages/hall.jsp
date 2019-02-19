<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">

    <div id="Top_header" >
    <h2>List of Halls</h2>
        <a href="${pageContext.request.contextPath}/insertHall" class="btn btn-default">Add new Hall</a>
    </div>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="hall" items="${halls}">
            <tr>
                <td><c:out value="${hall.id}"/></td>
                <td><c:out value="${hall.hallName}"/></td>
                <td><a href="/editHall?id=<c:out value='${hall.id}'/>"><span class="glyphicon glyphicon-pencil"></span></a></td>
                <td><a href="/halldelete?id=<c:out value='${hall.id}'/>"><span class="glyphicon glyphicon-remove"></span></a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>