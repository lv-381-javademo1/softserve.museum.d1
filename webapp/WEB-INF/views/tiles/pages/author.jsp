<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <h2>List of Author</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>AuthorID</th>
            <th>FirstName</th>
            <th>LastName</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="author" items="${authors}">
            <tr>
                <td><c:out value="${author.authorId}" /></td>
                <td><c:out value="${author.firstName}" /></td>
                <td><c:out value="${author.lastName}" /></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>