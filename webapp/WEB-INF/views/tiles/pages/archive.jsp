<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <h2>List of Archive</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ExcursionName</th>
            <th>GuideName</th>
            <th>GuideSurname</th>
            <th>StartTime</th>
            <th>EndTime</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="archive" items="${archives}">
            <tr>
                <td><c:out value="${archive.excursion.name}" /></td>
                <td><c:out value="${archive.employee.firstName}" /></td>
                <td><c:out value="${archive.employee.lastName}" /></td>
                <td><c:out value="${archive.startTime}" /></td>
                <td><c:out value="${archive.endTime}" /></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>