<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet">
</head>

<body>
<header id="header">
    <tiles:insertAttribute name="header"/>
</header>

<section id="sidemenu">
    <tiles:insertAttribute name="menu"/>
</section>

<section id="site-content">
    <tiles:insertAttribute name="body"/>
</section>

<footer id="footer">
    <tiles:insertAttribute name="footer"/>
</footer>
</body>
</html>