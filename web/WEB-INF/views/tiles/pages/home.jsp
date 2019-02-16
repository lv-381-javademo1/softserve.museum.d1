<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <h2>List of Excursion</h2>
    <table class="table">
        <thead>
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>StartTime</th>
            <th>Duration</th>
            <th>Duration</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="excursion" items="${excursionss}">
            <tr>
                <td><c:out value="${excursion.name}" /></td>
                <td><c:out value="${excursion.price}" /></td>
                <td><c:out value="${excursion.startTime}" /></td>
                <td><c:out value="${excursion.duration}" /></td>
                <td><a href="book_excursion/?id=<c:out value='${excursion.excursionId}'/>"><button type="button" class="btn btn-default">Book</button></a></td>

            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>