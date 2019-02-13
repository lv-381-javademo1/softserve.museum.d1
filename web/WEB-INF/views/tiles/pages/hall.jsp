<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <h2>List of Halls</h2>
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
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>