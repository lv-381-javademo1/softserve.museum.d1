<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="col-md-6 main-form">

    <form action="${pageContext.request.contextPath}/editHall", method="post">

        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" placeholder="<c:out value='${hall}'/>" name="Name">
        </div>

        <button type="submit" class="btn btn-default">Submit</button>

    </form>

</div>