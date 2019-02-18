<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <h2>List of Booked Excursions</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>UserName</th>
            <th>Email</th>
            <th>Booking Time</th>
            <th>ExcursionID</th>
            <th>Name</th>
            <th>Prise</th>
            <th>Start Time</th>
            <th>Duration</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="bookedExcursion" items="${bookedExcursionList}">
            <tr>
                <td><c:out value="${bookedExcursion.id}" /></td>
                <td><c:out value="${bookedExcursion.userName}" /></td>
                <td><c:out value="${bookedExcursion.email}" /></td>
                <td><c:out value="${bookedExcursion.bookingTime}" /></td>
                <td><c:out value="${bookedExcursion.excursion.excursionId}" /></td>
                <td><c:out value="${bookedExcursion.excursion.name}" /></td>
                <td><c:out value="${bookedExcursion.excursion.price}" /></td>
                <td><c:out value="${bookedExcursion.excursion.startTime}" /></td>
                <td><c:out value="${bookedExcursion.excursion.duration}" /></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
