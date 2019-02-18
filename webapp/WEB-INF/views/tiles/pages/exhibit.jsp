<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">

    <div id="Top_header" >
        <h2>List of Exhibit</h2>
    </div>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Material</th>
            <th>Technique</th>
            <th>Hall</th>
            <th>Author</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="exhibit" items="${exhibits}">
            <tr>
                <td><c:out value="${exhibit.exhibitID}"/></td>
                <td><c:out value="${exhibit.exhibitName}"/></td>
                <td><c:out value="${exhibit.material}"/></td>
                <td><c:out value="${exhibit.technique}"/></td>
                <td><c:out value="${exhibit.hall}"/></td>
                <td><c:out value="${exhibit.authorFirstname}"/> <c:out value="${exhibit.authorLastname}"/></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>