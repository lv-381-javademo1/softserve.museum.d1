<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <h2>List of Excursion</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>StartTime</th>
            <th>Duration</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="excursion" items="${excursions}">
        <tr>
            <td><c:out value="${excursion.name}" /></td>
            <td><c:out value="${excursion.price}" /></td>
            <td><c:out value="${excursion.startTime}" /></td>
            <td><c:out value="${excursion.duration}" /></td>
        </tr>
        </c:forEach>
        </tbody>

    </table>
</div>